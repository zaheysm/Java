import java.util.ArrayList;

public class ReadIP {

    private ArrayList<String> IP = new ArrayList<>();
    private ArrayList<String> subnetcal = new ArrayList<>();
    private ArrayList<String> wildcard = new ArrayList<>();
    private ArrayList<String> Subnet = new ArrayList<>();
    private ArrayList<String> Broadcast = new ArrayList<>();
    private ArrayList<String> HostMin=new ArrayList<>();
    private ArrayList<String> lhip=new ArrayList<>();
    private String ip;
    private String subnet;


    public ReadIP(String ip, String subnet) {
        this.ip = ip;
        this.subnet = subnet;
    }

    public void convertiptobinary(String[] splitIP) {
        for (String s : splitIP) {
            int i = Integer.parseInt(s);
            String str = Integer.toBinaryString(i);
            String complete = "";
            if (str.length() < 8) {
                int length = 8 - str.length();

                for (int j = 0; j < length; j++) {
                    complete += "0";
                }

            }
            str = complete + str;
            IP.add(str);
        }
    }

    public void netMask(int bits) {
        String complete = "";
        int bitcount = 32;
        for (int j = 0; j < 4; j++) {

            if (bitcount >= 8 && bits > 8) {
                subnetcal.add("11111111");
            } else if (bits > 8) {
                subnetcal.add("11111111");
            } else if (bits > 0) {
                for (int z = 0; z < bits; z++) {
                    complete += "1";
                }
                for (int z = 0; z < 8 - bits; z++) {
                    complete += "0";
                }
                subnetcal.add(complete);
            } else {
                subnetcal.add("00000000");
            }
            bitcount = bitcount - Integer.parseInt(subnet);
            bits = bits - 8;
        }

    }

    public void wildcard() {
        wildcard.add("11111111");
        wildcard.add("11111111");
        wildcard.add("11111111");
        wildcard.add("11111111");

        for (int i = 0; i < 4; i++) {
            int result = Integer.parseInt(subnetcal.get(i), 2) - Integer.parseInt(wildcard.get(i), 2);
            wildcard.set(i, Integer.toBinaryString(Math.abs(result)));
        }

        for (int j = 0; j < wildcard.size(); j++) {
            int size = wildcard.get(j).length();
            if (size < 8) {
                int length = 8 - size;
                String str = "";
                for (int i = 0; i < length; i++) {
                    str += "0";
                }
                wildcard.set(j, str + wildcard.get(j));

            }
        }
    }

    public void Subnet() {
        for (int i = 0; i < IP.size(); i++) {
            String s1 = IP.get(i);
            String s2 = subnetcal.get(i);
            String s3 = "";
            for (int j = 0; j < s1.length(); j++) {
                if ((s1.charAt(j) == s2.charAt(j) && (s1.charAt(j) == '1'))) {
                    s3 += "1";
                } else {
                    s3 += "0";
                }
            }
            Subnet.add(s3);

        }
    }

    public void Broadcast(String subnet) {
        String fulliIpBin = "";
        for (String s : Subnet) {
            fulliIpBin += s;
        }
        char[] ch = fulliIpBin.toCharArray();

        for (int i = (Integer.parseInt(subnet)); i < fulliIpBin.length(); i++) {
            ch[i] = '1';
        }

        fulliIpBin = String.valueOf(ch);

        String str = "";
        int counter = 0;
        for (int i = 0; i < fulliIpBin.length(); i++) {
            str = str + String.valueOf(fulliIpBin.charAt(i));
            counter++;
            if (counter == 8) {
                Broadcast.add(str);
                str = "";
                counter = 0;
            }
        }
    }

    public void firstHostIp() {
        HostMin.addAll(Subnet);
        Integer fhip = Integer.parseInt(Subnet.get(3), 2) + 1;
        String fhips = Integer.toBinaryString(fhip);

        for (int i = 0; i < 8; i++) {
            if (fhips.length() < 8) {
                fhips = "0" + fhips;
            }
        }
        HostMin.set(3, fhips);
    }


    public void lastHostip() {
        lhip.addAll(Broadcast);
        String lhipl = Integer.toBinaryString(Integer.parseInt(lhip.get(3), 2) - 1);
        lhip.set(3, lhipl);
    }


    public void printinfo() {
        System.out.printf("%10s %18s %36s\n","Address:" , ip ,printarray(IP));
        System.out.printf("%10s %15s=%s %36s\n","Netmask:",converttoip(subnetcal),subnet,printarray(subnetcal));
        System.out.printf("%10s %18s %36s\n","Wildcard:",converttoip(wildcard),printarray(wildcard));
        System.out.printf("%10s %18s %36s\n","Subnet :",converttoip(Subnet),printarray(Subnet));
        System.out.printf("%10s %18s %36s\n","Broadcast:",converttoip(Broadcast),printarray(Broadcast));
        System.out.printf("%10s %18s %36s\n","HostMin :",converttoip(HostMin),printarray(HostMin));
        System.out.printf("%10s %18s %36s\n","HostMax :",converttoip(lhip),printarray(lhip));
        subniting();
        HIPs();


    }
    public String converttoip(ArrayList<String> array){
        String str="";
        int counter=0;
        for (String s : array) {
            counter++;
            str=str+Integer.parseInt(s,2);
            if (counter!=4){
                str+=".";
            }
        }

        return str;
    }
    public String printarray(ArrayList<String> array) {
        String str = "";
        int counter = 0;
        for (String s : array) {
            str = str + s;
            counter++;
            if (counter != 4) {
                str += ".";
            }
        }
        return str;
    }

    public void subniting() {

        int classIp = Integer.parseInt(IP.get(0),2);
        int borrowed;
        int bit=0;
        if (classIp < 126) {
            borrowed =Integer.parseInt(subnet)-8;
            bit=8;

        } else if (classIp > 127 && classIp < 192) {
            borrowed = Integer.parseInt(subnet) - 16;
            bit=16;
        } else {
            borrowed = Integer.parseInt(subnet) - 24;
            bit=24;
        }
        System.out.println("s="+borrowed);
        System.out.println("s="+Math.pow(2,borrowed));
        SubnetIndex(bit,borrowed);
    }


    public void SubnetIndex(int start,int borrowed){
        String s2="";
        //start=32-Integer.parseInt(subnet);
        for (int i=0;i<Subnet.size();i++){
            s2+=Subnet.get(i);
        }
        //System.out.println(Integer.parseInt(s1,2)-Integer.parseInt(s2,2));
        String subnetIndexstr=s2.substring(start,borrowed+start);
        int subnetIndex=Integer.parseInt((subnetIndexstr),2);
        System.out.println("Subnet index ("+subnetIndexstr+") = "+subnetIndex);

    }

    public void HIPs(){
        int subnetHosts=32-Integer.parseInt(subnet);
        int numberOfHosts=(int)Math.pow(2,subnetHosts)-2;
        System.out.println("h="+subnetHosts);
        System.out.println("HIPs Hosts/Net: "+numberOfHosts);
    }
}






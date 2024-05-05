
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter ip address");
        String inputip=scan.nextLine();
        String[] splitipfromsub = inputip.split("\\/");
        String ip=splitipfromsub[0];
        String subnet=splitipfromsub[1];

        String [] splitIP=ip.split("\\.");
        int bits=Integer.parseInt(subnet);

        ReadIP convert=new ReadIP(ip,subnet);
        convert.convertiptobinary(splitIP);
        convert.netMask(bits);
        convert.wildcard();
        convert.Subnet();
        convert.Broadcast(subnet);
        convert.firstHostIp();
        convert.lastHostip();
        convert.printinfo();
        
        scan.close();






















    }






}

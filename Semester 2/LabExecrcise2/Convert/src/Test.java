import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        //String ip="";
        System.out.println("Please enter ip address");
        String inputip=scan.nextLine();
        String[] splitipfromsub = inputip.split("\\/");
        String ip=splitipfromsub[0];
        String subnet=splitipfromsub[1];

        String [] splitIP=ip.split("\\.");
        ArrayList<String> binary=new ArrayList<>();
        int convertit=32;
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






















    }






}

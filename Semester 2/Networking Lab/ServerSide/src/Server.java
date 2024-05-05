import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {

		ServerSocket service=null;
		Socket client=null;
		DataInputStream input=null;
		//DataOutputStream output=null;
		PrintWriter  output=null;
		Scanner scan=new Scanner(System.in);

		try {
			service=new ServerSocket(1254);
			client=service.accept();


			output = new PrintWriter(client.getOutputStream(), true);
			String message;

		 while (true) {
		 	 //message = scan.nextLine();
			 output.println("Hello client");
		 }
		}catch(IOException e) {
			System.out.println("failed in reading");
		}

	}

}

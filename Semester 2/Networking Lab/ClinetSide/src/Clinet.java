import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Iterator;
import java.util.stream.Stream;

public class Clinet {

	
	public static void main(String[] args) throws IOException {
		
		DataInputStream input=null;
		PrintWriter output=null;
		Socket clinet=null;
		try {
			clinet=new Socket("localhost",1254);
			output= new PrintWriter(clinet.getOutputStream());
			input= new DataInputStream(clinet.getInputStream());
		}catch(IOException e) {
			System.out.println(e);
		}

			BufferedReader serverInput = new BufferedReader(new InputStreamReader(clinet.getInputStream()));
			String message;
			message=serverInput.readLine();
			System.out.println(message);	
			

			output.close();
			input.close();
			clinet.close();	

	}

}

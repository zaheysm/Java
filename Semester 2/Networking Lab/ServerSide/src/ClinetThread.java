import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class ClinetThread implements Runnable{
	private Socket clientSocket;
	String closeserver;
	
	public ClinetThread(Socket socket) {
		this.clientSocket = socket;
	}
	
	public void run() {
		PrintWriter out =null;
		BufferedReader in=null;
		try {
		System.out.println ("Connection successful");
	    System.out.println ("Waiting for input.....");
	    
	    out = new PrintWriter(clientSocket.getOutputStream(), 
	                                      true); 
	    in = new BufferedReader( 
	            new InputStreamReader( clientSocket.getInputStream())); 

	    String inputLine; 

	    while ((inputLine = in.readLine()) != null) 
	        { 
	         System.out.println ("Server: " + inputLine); 
	         out.println(inputLine); 

	         if (inputLine.equals("Bye."))
	        	 closeserver="Bye.";
	             break; 
	        } 
	    out.close(); 
	    in.close(); 
	    clientSocket.close();
		}catch(IOException e) {
			System.out.println("Error");

	}}

}

import java.net.*; 
import java.io.*; 

public class EchoServer 
{ 
 public static void main(String[] args) throws IOException
   { 
    ServerSocket serverSocket = null; 

    try { 
         serverSocket = new ServerSocket(1254);
         serverSocket.setReuseAddress(true);
        } 
    catch (IOException e) 
        { 
         System.err.println("Could not listen on port: 12345."); 
         System.exit(1); 
        } 

    Socket clientSocket = null; 
    System.out.println ("Waiting for connection.....");
    try { 
    while(true) {
    
         clientSocket = serverSocket.accept(); 
        
    
         ClinetThread startthread=new ClinetThread(clientSocket);
    
         new Thread(startthread).start();
        
    }
    }catch (IOException e) 
    { 
     System.err.println("Accept failed."); 
     System.exit(1); 
    }
    serverSocket.close(); 
   } 
} 

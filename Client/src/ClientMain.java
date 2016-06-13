import java.io.*;
import java.net.*;
import java.util.*;

public class ClientMain {
	public static void main(String args[]) throws UnknownHostException, IOException {
		ClientMain main = new ClientMain();
		main.run();
	}
	public void run() throws UnknownHostException, IOException {
		Scanner console = new Scanner(System.in);
		
		Socket socket = new Socket("localhost", 444);
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		
		String srv;
		while(console.hasNextLine()) {
			ps.println(console.nextLine());
			
			srv = br.readLine();
			System.out.println(srv);
		}
		
	}
}

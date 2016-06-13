import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerMain {
	public static void main(String args[]) throws IOException {
		ServerMain main = new ServerMain();
		main.run();
		
	}
	
	public void run() throws IOException {
		Scanner console = new Scanner(System.in);
		
		ServerSocket srvsocket = new ServerSocket(444);
		Socket server = srvsocket.accept();

		InputStreamReader isr = new InputStreamReader(server.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		
		PrintStream ps = new PrintStream(server.getOutputStream());
		
		String client;
		while((client = br.readLine()) != null) {
			System.out.println(client);
			ps.println(console.nextLine());
			
		}

	}
}

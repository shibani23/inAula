import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("AVVIO BROWSER");
		
		//Socket s = new Socket("160.80.144.166",9742);
		Socket s = new Socket("www.google.it",80);

		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//bw.write("Ciao server!");
		bw.write("GET /index.html HTTP/1.1\n");
		
		bw.write("Host: www.google.it\n\n");
		
		bw.flush();
		
		String str= br.readLine();
		System.out.println(str);
		
		
		s.close();
		

	}

}

package day08;

import day07.ConsolChatServer;
import java.io.*;
import java.net.*;

public class ConsolChatClient implements Runnable {
	// Socket 클래스
	// Data,out 객체

	Socket sock = null;

	public ConsolChatClient() {

		try {
			sock = new Socket("10.10.108.146", 50001);
			System.out.println("서버와  연결 성공");
			BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pout = new PrintWriter(sock.getOutputStream(),true);

			Thread thread = new Thread(this);
			thread.start();
			String msg = "";
			while ((msg = key.readLine()) != null) {

				pout.print(msg);
			}

			// System.out.println("서버와 연결 성공~");
		} catch (IOException e) {

		}
	}

	public static void main(String[] args) {

		new ConsolChatClient();

	}

	@Override
	public void run() {
		try {
			InputStream is = sock.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader (is));
			String serverMsg="";
			while(true) {
				serverMsg = br.readLine();
				System.out.println("From Server:"+serverMsg);
			}
			
			}catch (Exception e) {
				System.out.println("예외"+e.getMessage());
		}
	}
}
	

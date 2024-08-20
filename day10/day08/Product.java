package day08;

import java.io.DataInputStream;
import java.util.concurrent.Executors;

public class Product {
	private int no;
	private String name;
	private List<product> products;
	
	public void start() throws IOException{
		serverSocket = new ServerSocket(50001);
		threadpool = Executors.newFixedThreadPool(100);
		products = new Vector<Product>();
		System.out.Println("[서버]시작됨");
	}
	//중첩 클래스 정의하기
	class SocketClient{
		Socket socket;
		DataInputStream dis;
		DataOutputStream dos;
		receive();
		public SoketClient(Socket socket) throws IOException{
			this.socket = socket;
		}
		public Socketclient(Socket socket) {
			
		}
		public void recive() {
			while(true) {
				String msg = dis.readUTF();
				JSONObject request = new JSONOBject();
				request.getInt("menu");
				
				switch(menu) {
				case 1: 
				break;
				case 2:
					break;
				case3:
					break;
				
				}
			}
		}//receive()~~~~~~
		
	}
	 
}

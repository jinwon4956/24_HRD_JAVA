package day07;
import java.net.InetAddress;
import java.io.IOException;
public class InetAddressExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP주소"+local);
			InetAddress[] lacals = InetAddress.getAllByName("www.dju.ac.kr");
			for(InetAddress ia: lacals) {
				System.out.println("www.naver.com IP 주소"+ia.getHostAddress());
			}
		}catch(IOException e) {
			
		}
	}

}

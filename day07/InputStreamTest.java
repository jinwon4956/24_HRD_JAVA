package day07;

import java.io.IOException;
import java.io.InputStream;
public class InputStreamTest {

	public static void main(String[] args) {
		//데이터 소스 : 키보드
		//데이터 목적지: 모니터
		//read()
		// read()
		// ctrl +D
		//InputStream의 read() 메소드는 바이트 입력을 리턴하고
		//입력이 종료되면(ctrl+ ctrlD)-1을 리턴한다
		
		try {
		
			int r= 0;
			int count =0;
			
			while(true) {
				r = System.in.read();
				count ++;
				
			if(r=='x'|| r=='X') {
				System.out.println("r="+r);
				break;
				
			}
			System.out.println("********************");
			System.out.println(count+"bytes 읽음");
			System.out.println("********************");
			System.in.close();
							
			}
	}catch(IOException e) {
		e.getMessage();
	}

	}

}

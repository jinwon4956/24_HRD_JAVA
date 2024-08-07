package day02;
import java.util.Random;
public class RamdomExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//임의의 수를 생성과 수를 다루는 내장 객체-> Ramdom클래스
		// 참조형 변수 선언으로 생성한다.
		Random random = new Random();
		
		// 1~45번까지 생성하기 무조건 난수를 정하는 값의 범위는 00<=y<1,0
		for(int i=1; i<=6; i++) {
			
			
			
			int num = random.nextInt(45)+1;// 먼저해석
			System.out.println(num);
			
		}
		
		
	}

}

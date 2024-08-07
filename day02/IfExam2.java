package day02;
import java.util.Scanner;

public class IfExam2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("##메뉴 선택##"+"\n[1]구매자 [2] 판매자"+"\n##메뉴를 선택 하세요->");
	int jumsu = 50;
	jumsu=scan.nextInt();
	String menu=""; //
	if(jumsu ==1) {
		System.out.println("환영합니다! 구매자로 로그인하셨습니다");
	
		
	}else if(jumsu==2) {
		System.out.println("환영합니다 판매자로 로그인하셨습니다");
	}
		
		
		
		
	}

}

package day02;
import java.util.Scanner;
public class DoWhileExam6 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String inputString;
		System.out.println("메세지를 입력하세요"+"\n프로그램을 종료하려면 q를 입력하세요");
		
		do {
			System.out.print(">");
			inputString =scanner.nextLine();
			System.out.println(inputString);
		} while( ! inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
			
		}
				
	}
}

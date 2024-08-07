package day02;
import java.util.Scanner;
import java.util.Random;
public class Game3 {

	public static void main(String[] args) {
		// 문제 2: continue문 369 게임
		//1부터 10까지의 정수 출력중 3,4,9 일때 박수 소리를 출력하는 ㅡ로그램 작성하기
		//------------------------------------------
		//실행결과
		//1 2 짝 45 짝 78 짝 10
		
		for(int i=1; i<=10; i++) {//
			
			if((i==3)||(i==6)||(i==9) ){//내부 조건식에 의해 i가 369인경우)
				System.out.print("짝 ");//박수소리 출력 후 다음 반복으로 ㅓㅁ어감
				continue;
				
			}
			System.out.print(i+" ");
			
			
			
		}
	
	
	}
}
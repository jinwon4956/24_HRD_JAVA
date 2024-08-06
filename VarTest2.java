package day01;
import java.util.Scanner; // 스캐너 입력 값 받는방법

public class VarTest2 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);//자료명 똑같아야함 new 클래스는 똑같다 생성자
	
		
		// TODO Auto-generated method stub
		// 변수의 본질은 메모리 int 자료형, y변수
		
	// 1, 정수변수
		int x; //4바이트를 확보한다 //변수 초기화

		x = 5;//대입 연산자
		System.out.print("첫번째 정수 입력:");
		x= scan.nextInt();
		
		
		int y = 8; //한줄로 만들기 
		System.out.print("두번째 정수 입력:");
		y= scan.nextInt();
		
		int result = x + y;
		
		//sysout 컨트롤 스페이스 엔터,플롯 더블 메모리크기
		System.out.println(result);
		
		//2. 실수변수
		// float(4byte) double(8byte)
		double height = 155.7 ;// 초기화는 
		System.out.print("키는:");
		height= scan.nextDouble();
		float weight = 45.5f;// 접미사 f 를 붙혀야한다 float f를 안붙히면 더블로 표현
		System.out.print("몸무게는:");
		weight= scan.nextFloat();
		
		//3. 문자형 변수
		// char , 특수문자
		
		char blood = 'A';//문자는 '' 작은 따음표 써야함 문자열을 나열한때에는 큰 따음표 ""
		
		//4. 문자열 변수
		//String 스트링은 대문자로 시작
		String name = ""; // 기본형 스티링 , 참조형 인터페이스 
		System.out.print("이름을 입력하세요:");
		name= scan.next();//nextLine x
		System.out.print("키:"+height+"\n몸무게:"+weight+"\n");//문자열 연결시킬려면 연결연산자+를 붙혀야함
		System.out.println("혈액형:"+ blood +"형 입니다.");
		System.out.println("이름:"+ name +"입니다.");
		//5. 논리형변수
		
		//boolean형
		boolean stop = true; //큰따음표 금지
		
		if (stop== true) { // 2개 출력시킬려면  중괄호 핈 {, == 비교연사자
			System.out.println("중지합니다.");  // alt 방향키 위아래 누르면 위치 변경가능 그줄 
		
		}else {
			System.out.println("시작합니다");
			
		}
		
		
	}

}

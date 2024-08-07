package day02;

public class RefType {

	public static void main(String[] args) {
		//stack 지역변수, {}가 전부 블럭안에 쌓임 hip은 메모리 Ref타입

		// new 
				RefType ref = new RefType();//ref는 100을 가리킨다
				RefType ref2 = new RefType(); //새로운 공간을 가리킨다
				
				if(ref==ref2) {
					System.out.println("동일한 주소를 갖는 객체이다");
				}else {
					System.out.println("다른 주소를 갖는객체이다ㅣ");
				}
				String name = new String("김진원");
				System.out.println(name);
				String name2 = "오늘도 수고했어";
				System.out.println(name2.length());
				int[] score =new int [5];
				score[0]=10;
				score[1]=20;
				score[2]=30;
				score[3]=40;
				score[4]=50;
				
				int sum = 0;
				for(int i=0; i<score.length; i++) { //score.length
					sum = sum +score[i];
				
				}
				System.out.println("총합:"+sum);
	}

}

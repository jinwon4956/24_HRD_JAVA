package day02;

public class WhileExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(초기식; 조건식; 증감식){ 반복 수행문}
		//1에서 100까지 짝수들의 총합을 계산하여 출력하시오
		
		int i=0, sum=0; //while 위에 변수가 들어가야한다.
		while(i<=100) {
		

			if(i%2==0) { //같지 않다는"!" <홀수의 합
				sum = sum+i;
	
		}
			i++; //while문은 여기서 끝난다 증감식
		}
		System.out.println("0까지 100까지 짝수들의 합:"+sum);
	}

}

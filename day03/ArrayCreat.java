package day03;

public class ArrayCreat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//문자열 데이터 4개르 저장할 배열 선언 및 초기화
			String [] season = {"Spring","summer","Fall","Wintter"};	//index 번호 
			
			for(int i=0; i<4; i++) {
				System.out.println(season[i]);//index 번호 
				
			}
			season[1] ="여름";
			for(int i=0; i<4; i++) {
				System.out.println(season[i]);//index 번호 
			}
			//이름 문자열 3개를저장할 배열 선언및 초기화
			String[] names= null; // 기본 초기화 값은 null; 로 해라
			names = new String[] {"김진원","윤현정","헿"};
	}
}

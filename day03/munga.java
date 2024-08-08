package day03;
import java.util.Scanner;
public class munga {

	public static void main(String[] args) {
		int maxScore=0;
		int studentNum =0;
		double avgScore= 0.0;
		int [] scores =null;
		while(true) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("1.학생수 | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("-----------------------------------------------------------");
		
		Scanner  scan= new Scanner(System.in);
		
		int selectNo =Integer.parseInt(scan.nextLine());
		System.out.println("선택>");
		int num = scan.nextInt();
		
		if(selectNO ==1) {
			System.out.println("학생수");
			studentNum= Integer.parseInt(scan.nextLine());
		}
		
		else if(selectNO == 2) {
			for(int i=0; i<scores.length; i++) {
				System.out.print("scores["+i+"]>");
				int j= scan.nextInt();
				scores[i]=j;
			}
		}else if(num==3) {
			for(int i=0; i<scores.length; i++) {
				System.out.println("scores["+i+"]:"+scores[i]);
			}
			
		}else if(num==4) {
			maxScore=scores[0];
			for(int i=0; i<scores.length; i++) {
				if(scores[i]>maxScore) {
					maxScore = scores[i];
				}
				sum +=scores[i];
				
			}
			avgScore  =(double) sum/ scores.length;
			System.out.println("최고 점수:" + maxScore);
			System.out.println("평균 점수: +avgScore");
			
		}else if(num==5) {
			System.out.println("종료");
			System.exit(0);
		}
	
	}
}
}

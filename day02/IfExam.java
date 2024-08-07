package day02;
import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub

	int jumsu = 50;
	System.out.println("점수 입력");
	jumsu=scan.nextInt();
	
	String hakjum="";
	if(jumsu >=95) {
		hakjum ="A+";
	}else if(jumsu>=90){
		hakjum="A0";
	}else if(jumsu>=85){
		hakjum="B+";
	}else if(jumsu>=80){
		hakjum="B";
	}else if(jumsu>=75){
		hakjum="B0";
	}else if(jumsu>=70){
		hakjum="C+";
	}else if(jumsu>=65){
		hakjum="C";
	}else if(jumsu>=60){
		hakjum="C0";
	}else if(jumsu>=55){
		hakjum="D+";
	}else if(jumsu>=50){
		hakjum="D0";
	}else if(jumsu>=45){
		hakjum="f";
		
	}
	System.out.println("학점은:"+hakjum+"입니다");
		
		
		
	}

}

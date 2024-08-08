package day03;

public class Car {

	
	//객체 모델링  (클래스 멤버) 
	
	//속성 : has -a 멤버 변수
	String model;
	String company;
	String color;
	int maxSpeed;
	
	int rpm;
	int speed;
	
	// 기본 생성자
	public Car() {
		
	}
	//인자 생성자
	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	
	}
	public Car(String company, String model, String color) {
		this(String company,String model,String color){
			this(company,model,color,200);
		}
		}
	
	//메소드
	void CarInfo() {
		System.out.println("==========================");
		System.out.println("제조회사:"+ company);
		System.out.println("모델:"+ model);
		System.out.println("색깔:"+ color);
		System.out.println("최고속도:"+ speed);
		System.out.println("=====================");
	}
	void car(){
		System.out.println("먹는다");
	}
}

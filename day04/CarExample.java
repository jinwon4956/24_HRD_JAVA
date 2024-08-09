package day04;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.tire = new tire();
		car.setSpeed(100);
		car.setStop(false);
		System.out.println(car.getSpeed());//호출하는쪽에서 시스아웃
		System.out.println(car.getStop());
	}

}

class Car{
	//캡슐화
	private int speed;
	private boolean stop;
	
	Tire Tire;
	
	
	public void run() {
		tire.roll();
	}
	//setter 메소드 정의 필드 갑 변경 하는 메소드
public void setSpeed(int speed) { //S대문자

	this.speed = speed;
} 
public void setStop(boolean stop) { //S대문자
	this.stop = stop;
}
public int getSpeed() {
	return speed;
}
public boolean getStop() {
	return stop;
}
}
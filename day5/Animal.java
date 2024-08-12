package day5;
interface soundable{

	public String sound();
}
abstract class Animal {
	//추상 클래스.. 적어도 한개 이사의 추상 메소드를 갖는 클래스
	// 추상 메소드: 바디가 없는 메소드
	abstract void sound();
	
}
class Dog extends Animal{
	void sound() {
		System.out.println("멍멍 소리낸다");
		
}
}
class Cat implements Soundable{
	
@Override
	public String sound() {
			return "야옹";
		
	}
public class AnimalTest{
	public static void main(String[] args) {
		public static void printSound(soundable soundalbe) {
			System.out.println(soundable.sound());
			public static void main(String[]args) {
			AnimalTest.printSound(new Dog());
			AnimalTest.printSound(new cat());	
			}
			//		void sound() {
//			System.out.println("야옹 소리를낸다.");
		}
	}
//		Animal animal = new Dog();
//		animal.sound();


}
	}



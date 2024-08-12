package day5;
interface Vehicle{
	public void run();

}
class Bus implements Vehicle{
	public void run() {
		System.out.println("버스가 달린다.");
	}
}
class Taxi implements Vehicle{
	public void run() {
		System.out.println("버스가 달린다");
	}
}
class Driver{
	void drive(Vehicle v) {
		System.out.println("운저자...");
	}
}
void drive(V)
System.out.println();
v.run();
public class DriverTest {
	

	public static void main(String[] args) {
		Driver drive = new Driver();
		Bus bus = new Bus();
		driver.drive(bus);
		driver.drive(new Taxi());

	}

}

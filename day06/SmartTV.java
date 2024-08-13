package day06;

public class SmartTV extends Product {
	String resolution;
	
	public SmartTV(String pname, int price, String carrier) {
		this.pname=pname;
		this.price= price;
		this.resolution = carrier;
	}
	public void printExtra() {
	System.out.println("통신사:"+resolution);
	}
	
	
}

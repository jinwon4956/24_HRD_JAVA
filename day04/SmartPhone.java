package day04;

public class SmartPhone extends phone{
	
public boolean Wifi;
//생성자 서언
	
	public SmartPhone(String model,String color) {
		super(model,color);
	
}
	@override
	public void  bell() {
		System.out.println("링딩동링딩동링딩동 벨소리가 울립니다....");
	}
	//
public void setWifi(boolean wifi) {
	this.Wifi=wifi;
	System.out.println("와이파이 상태를 변경했습니다.");
}
@Override
	public void bell() {
		// TODO Auto-generated method stub
		super.bell();
	}
public void internet() {
	System.out.println("인터넷에 연결합니다");
}
}

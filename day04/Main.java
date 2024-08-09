package day04;
import java.util.ArrayList;
public class Main {
	//클래스 구성 멤버 
	//필드 :객체의 데이터를 저장하는 역할을 한다.
	
	//생성자: 기본 생성자, 인자 생성자 인자 생성자는 어찌하더 선언해야한다
	
	//메소드: return 
	public static void main(String[] args) {
		House house1 =new House("김진원",3,"대전동구용운동");
		house1.showOwner(house1.ownerName);
		System.out.println("방의갯수:"+house1.getRoomNum());
		System.out.println("집의 정보:"+house1.showInfo());
		house1.showInfo2();
	
		ArrayList<House> arrList = new ArrayList<House>();
		arrList.add(house1);
		arrList.add(new House("강길동",2,"대전 서구 갈마동"));
		arrList.add(new House("이자바",4,"대전 중구 대흥동"));
	
		for(House house : arrList) {
			house.showInfo2();
		}
	}

}

// 집 클래스 모델링....
// 추상화

class House{
	//has-a~~
	String ownerName;
	int roomNum;
	String address;
	public House() {}
	
	//인자 생성자...
	public House(String ownerName, int roomNum, String address) {//클래스랑 같이
		this.ownerName= ownerName;
		this.roomNum =roomNum;
		this.address=address;
		
	}
	
	//1.반환없고,주인 이름을 매개변수로 전달 받아 이름을 같이 출력하는 메소드 shoOwner()정의 
	void showOwner(String name) { //반환없으면 보이드
		System.out.println("주인이름은"+name+"입니다.");

	}
	// TODO Auto-generated method stub


	//2.방의갯수를 반환하는 getRoomNum() 메소드 정의
	int getRoomNum() {
		return roomNum;
	}
		
	//3. 모든 멤버 변수의 값을 반환하는 showInfo() 메소드 정의
	String showInfo() {
		String result="집 주인이름"+ownerName +"\n방의 갯수:"+roomNum+"\n집 주소"+address;
		
		return result;
		
	}
	//showInfo()
	void showInfo2() {
	System.out.println("\"집 주인이름\"+ownerName +\"\\n방의 갯수:\"+roomNum+\"\\n집 주소\"+address");
}  

}
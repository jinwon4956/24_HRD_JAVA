package day5;

public class Person {
//이름 , 나이 정보 은닉
	private String name;
	private int age;
	//인자생성자//
	public Person(String name,int age) {
		this.name = name;
		this.age=age;
	
	//getter setter
		
	}
	public String getId() {
		this.id= id;
	}
	public void setId() {
		return id;
	
	}//이름 나이정보를 반환하는 메소드 personInfo
	public String PersonInfo() {
		String info="이름"+name+"\n나이:"+age;
		return info;
	}
	public void printall() {
		System.out.println(this.PersonInfo());
	}
	
}

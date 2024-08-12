package day5;

public class Student extends Person {
	
		
	
	//iD, 학급 변수 cName 추가
	private String id;
	private String cName;
	
	//생성자
	public Student(String id, String cName,String name, int age) {
		super(name,age);
		this.id = id;
		this.cName = dept;
	}
	//getter, setter

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getDept() {
		return dept;
	}



	public void setcName(String cName) {
		this.cName = cName;
	}
	
	//메소드 오버라이딩..
	@Override
	public String personInfo() {
		// TODO Auto-generated method stub
		String info = super.personInfo();
		info+="iD:"+id+"\n 학급이름:"+cName;
		return info;
	}
	static void inputPerson() {
		System.out.println("============="); 
		System.out.println("이름입력:"); 
		System.out.println("나이 입력"); 
		System.out.println("============="); 
		
}
}

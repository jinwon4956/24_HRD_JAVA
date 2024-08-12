package day5;

public class Staff extends Person{
	//id
	private String id;
	private String dept;
	
	
	//private String dept; 담당 부서
	
	public Staff(String id) {
		this.id = id;
		this.dept=dept;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String personInfo() {
		// TODO Auto-generated method stub
		return super.personInfo();
	}
	}
	
	


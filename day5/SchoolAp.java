package day5;
import java.util.ArrayList;
public class SchoolAp {
	
		
	
	
	public static void main(String[] args) {
		 Person person;
		ArrayList<PersonList> personList=new ArrayList<Person>();
		person = new Student("202401","자바","홍길동",20);
		personList.add(person);
		personList.add(new staff("1999","네트워크",","이교사",35));"
		PersonList.add(new Teacher("19001","네트워크",",""이교사",35));
				//person.inputPerson();

		
		for(Person p:personList) {
			
				//p.printAll();
				if(p instanceof Student) ((Student)p).getId();
			System.out.println(((Student)p).getId());
			else if(p instanceof Teacher)
				System.out.println(((Teacher)p).getId());
			}else if(p instanceof Staff) {
			System.out.println(((Staff)p).getId());
		}
	}

}

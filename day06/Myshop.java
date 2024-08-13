package day06;
import java.util.Scanner;
import java.util.ArrayList;

public class Myshop implements Ishop {
	User[] users = new User[2];
	Product[] products = new Product[4];
	ArrayList<Product> cart = new ArrayList<Product>();
	Scanner  scan= new Scanner(System.in);
	int selUser;
	String title;
	
	//메소드 정의 1 
	public void  productList() {
		
	}
	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void genUser() {
		User user1 = new User("홍길동",PayType.CARD);
		users[0] = user1;
		User users2 = new User("블로거",PayType.CASH);
		users[1] = user2;
	}
	@Override
	public void genProduct() {
		CellPhone cp = new CellPhone("갤럭시 노트5",1000000,"SKT");
		products[0] = cp;
		cp = new CellPhone("아이폰 15",1000000,"애플");
		products[1] = cp;
		SmartTV stv = new SmartTV("삼성스마트TV",2000000,"삼성");
		products[2] = stv;
		stv = new SmartTV("LG스마트TV",1000000,"lG");
		products[3] = stv;
		
	}
	@Override
	public void start() {
		System.out.println(title +":메인 화면-계정 선택");
				System.out.println("====================");
			int i = 0;
			
			//등록된 사용자 정보 출력
			for(Product p : products) {
				System.out.println("["+i+"]");
				p.printDetail();
				i++;
				
			}
			System.out.println("[h]메인화면");
			System.out.println("[c]체크아웃");
			System.out.println("선택:");
			String sel= scan.next();
			System.out.println("##"+sel+"선택##");
			//선택된 메뉴에 따라 처리
			
			switch(sel) {
			case "h":start();break;
			case "c":checkOut();break;
			default:
				int psel = Integer.parseInt(sel);
				cart.add(products[psel]);
				productList();
			}
	}
	public void checkOut() {
		String name; gmedlfo 
		
	}
	
	

}

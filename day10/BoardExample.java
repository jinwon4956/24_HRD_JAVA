package day10;
import java.util.Scanner;
public class BoardExample {

	private Scanner scanner = new Scanner(System.in);
	DataModel dm = null;
	public BoardExample() {
		dm = new DataModel();
	}
	public void list() {
		System.out.println("");
		System.out.println("[게시물 목록]");
		System.out.println("---------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n","no","writer","date","title");
		System.out.println("----------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n","1","winter","2022.01.27","게시판에 오신 것을 환영합니다.");
		System.out.printf("%-6s^-12s%-16s%-40s\n","2","winter","2022.01.27","올 겨울은 많이 춥십니다.");
		mainMenu();
		
		
	}
	public void mainMeun() {
		System.out.println();
		System.out.println("----------------");
		System.out.println("메인 메뉴: 1. creat | 2. Read | 3. Clear | 4.Exit");
		System.out.println("메뉴 선택:");
		String menu =scan.nextLine();
		System.out.println();
		switch(menuNO) {
		case"1":
			dm.create();
			break;
		case "2" :
			break;
		case "3":
			break;
		case "4":
			break;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

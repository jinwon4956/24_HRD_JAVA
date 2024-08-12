package day5;

public class PrintText implements Printable {

	public static void main(String[] args) {

		PrintText pt = new PrintText();
		pt.printMe();

	}
	public void printMe() {
		System.out.println("텍스트 파일 출력합니다..");
	}

}

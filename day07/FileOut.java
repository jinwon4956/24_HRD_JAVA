package day07;

import java.io.*;

public class FileOut {
//키보드로 입력 받고, 파일로 출력하기
//파일이름: result.txt
	public static void main(String[] args) {
		System.out.println("파일로 저장할 내용을 입력하세요=>");
		// FileOutputStream fos = new FileOutputStream("result.txt",true);
		int n = 0;
		try {
			FileOutputStream fos = new FileOutputStream("result.txt", true);
			BufferedOutputStream nos = new BufferedOutputStream(fos);
			FileReader fr = new FileReader("test.txt");
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			while ((n = fr.read()) != -1) {
				osw.write(n);
				osw.flush();
			}
			fos.close();
		} catch (FileNotFoundException fd) {

		} catch (IOException i) {

		}
	}
}

package day06;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterExample {
	static FileWriter fw= null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fw= new FileWriter("file.txt");
			fw.write("java");
				
		}catch(IOException e) {
			System.out.println(e.getMessage());
			System.out.println("파일이 존재 하지 않습니다");
			
		}finally {
			try {
				fw.close();
				
			}catch (IOException e ) {
				
			}
		}
	}

}

package day06;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
	
	public static void main(String[] args) throws IOException {
		static FileWriter fw = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		try {
			
			InputStream is = System.in;
			dis = new DataInputStraam(is)
			isr = new InputStremaReader(System.in);
			Reader reader = null;
			reader = new FileReader("file.txt");
			
			while(true) {
				int num = reader.read(data);
				if(num ==-1 ) break;
				for(int i=0; i<num; i++) {
					System.out.println(data[i]);
				}
			}
			reader.close();
			System.out.println();
			
			//문자 배열로 읽기
			
			reader = new FileReader("Test.txt");
			char[] data = new char[100];
			
			
		}catch(FileNotFoundException fe) {
			System.out.println("파일이 존재 하지 않습니다");
		}

	}

}

package day07;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {

	public static void main(String[] args) {
		try {
			String data = ""+"id: winter\n"+"email: winter@mycompany.com\n"+
		"tel: 010-537-4956";
		Path path = Paths.get("C:\\Temp\\user.txt");
	//	Files.writeString(Path("C:\\Temp\\user.txt",data,Charset.forName("UFT-8"));
		
		System.out.println("파일유형:"+Files.probeContentType(path));
		System.out.println("파일크기:"+Files.size(path)+"bytes");
		String content = Files.readString(path,Charset.forName("UTF-8"));
		System.out.println(content);
		}catch(IOException e) {
			
		}

	}

}

package day06;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.*;
public class DataInOutStream {
	DataOutputStream dos = null;
	DataOutputStream dis = null;
	
	public static void main(String[] args) {
		//1. source
		try {
			dos = new DataOuputStream(System.out);
			dos.writeint(0);
			dos.writedouble(155.3);
			dos.writeBoolean(true);
			dos.writechar('가');
			dos.writeUTF("문자열 입력하기");
			dos.flush();
			int a = dis.read();
			System.out.println("정수값:"+dis.readInt());
			System.out.println("실수값:"+dis.readBoolean());
			System.out.println("논리값:"+dis.Char());
			System.out.println("문자열값:"+dis.readUTF());
			dis.close();
			dos.close();
		}catch(IOException e) {
			e.getMessage();
		}
	}

}

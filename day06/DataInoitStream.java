package day06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
static BuffeeredInputStream ds =null;

public class DataInoitStream {
	public static void main(String[] args) {
		// 1. 키보드로 부터 
		InputStream is = System.in;
		dis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutStream(System,out);
		
		int data =0;
		While(( data = dis,read())!=-1){
			bos.write(data);
			bos.flush();
		}
		
	}catch(I)

}

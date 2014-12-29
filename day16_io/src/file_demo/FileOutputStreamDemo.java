package file_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./src/file_demo/FileOutputStreamDemo.java");
		FileOutputStream fos = new FileOutputStream("out.txt");
		
		byte [] bbuf = new byte[1024];
		int size = 0 ;
	
		while ((size = fis.read(bbuf))!=-1) {
			fos.write(bbuf);
			System.out.println(new String(bbuf,0,size));
			
		}

	}

}

package byte_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputStremDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1,创建文件对象
		File file = new File("./src/byte_demo/FileInputStremDemo.java");
		FileInputStream fis = new FileInputStream(file);
		int ch = 0;
		while ((ch=fis.read())!=-1){
		System.out.print((char)fis.read());
		byte[] bbuf = new byte[32];
		int size = 0;
		while ((size =fis.read(bbuf))!=-1){
			System.out.println(new String(bbuf));
		}
		
		}
	}

}

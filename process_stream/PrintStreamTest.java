package process_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/*1.�ṩһ���ڵ���
 * 2��װ�ɴ�����
 * 3
 * 4�ر�
 *ʹ��PrintStream��װOutPutStream
 */

public class PrintStreamTest {

	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=null;
		PrintStream ps =null;
		try {
			fos = new FileOutputStream("process_stream.txt",true);
		 ps = new PrintStream(fos);
			ps.println("������");
			ps.println(new PrintStreamTest());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			fos.close();
		}

	}

}

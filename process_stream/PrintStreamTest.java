package process_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/*1.提供一个节点流
 * 2封装成处理刘
 * 3
 * 4关闭
 *使用PrintStream包装OutPutStream
 */

public class PrintStreamTest {

	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=null;
		PrintStream ps =null;
		try {
			fos = new FileOutputStream("process_stream.txt",true);
		 ps = new PrintStream(fos);
			ps.println("处理流");
			ps.println(new PrintStreamTest());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			fos.close();
		}

	}

}

package char_stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("new.txt");
		fw.write("流对象：操作文件内容jijjk");
		fw.write("hjushu");
		//fw.flush();
		fw.close();
		FileWriter fw2 = new FileWriter("file_append111.txt",true); 
				fw2.write("Google");
				fw2.write("Gmail");
				fw2.close();
		

	}

}

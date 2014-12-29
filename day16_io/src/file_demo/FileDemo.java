package file_demo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//.��ǰ·��  .. ��һĿ¼
		File file = new File(".");
		System.out.println();
		System.out.println(file.getName());
        System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
       
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsoluteFile().getParent());
        System.out.println(file.getParent());
        
        
        File tmpFile = File.createTempFile("tem_file", ".txt");
        File tmp = File.createTempFile("tmp_file", ".txt",file);
        tmpFile.deleteOnExit();
        tmp.deleteOnExit();
        
        
        File file2 = new File("create_bycode");
        System.out.println("���ڣ�="+file2.exists());
      // System.out.println( file2.createNewFile());
       // System.out.println(file2.mkdir());
        System.out.println(file2.mkdirs());
        System.out.println("���ڣ�="+file2.exists());
       
	}

}

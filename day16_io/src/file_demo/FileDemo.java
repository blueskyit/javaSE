package file_demo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//.当前路径  .. 上一目录
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
        System.out.println("存在？="+file2.exists());
      // System.out.println( file2.createNewFile());
       // System.out.println(file2.mkdir());
        System.out.println(file2.mkdirs());
        System.out.println("存在？="+file2.exists());
       
	}

}

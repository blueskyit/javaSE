package char_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

public class FileReaderDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException  {
		//FileReader fr = new FileReader("new.txt");
		
		  FileReader fr = new FileReader("new.txt");  
	       FileWriter fos = new FileWriter("out111.txt");
	            char[] cbuf = new char[32];  
	      
	            int size = 0;  
	           
	            while(( size = fr.read(cbuf))!=-1)  
	            {  
	            	//fos.write(cbuf, 0, size);
	                System.out.println(new String(cbuf,0,size));  
	            }  
	
	 
	        fr.close();  
	          fos.close();  
	        }  
		
		

	

}
	

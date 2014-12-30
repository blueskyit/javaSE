package redir_stdio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.PseudoColumnUsage;
import java.util.Scanner;

/* 
 * 
 * */
public class RedirStdio {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		PrintStream ps = null;
//		try {
//			
//			 ps = new PrintStream(new FileOutputStream("redir.txt"));
//		    System.out.println("qian zhongduan ");
//			System.out.println(new Object());
//		  //  System.setOut(ps);
//			System.out.println("hou wenjian ");
//		    System.out.println(new Object());
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			ps.close();
//		}
//		
		FileInputStream fis=null;
		try {
			 fis = new FileInputStream("redir.txt");
		 
		  //  Scanner sc = new Scanner(System.in);
		   
		   // System.out.println("please input name:");
		    //String str = sc.next();
		   // System.out.println("qian  zhongduan "+str);
		    System.setIn(fis);
		    Scanner sca = new Scanner(System.in);
		   sca.useDelimiter("\n");
		   while(  sca.hasNext()){
			   
		    System.out.println("文件输入内容 "+sca.next());
		    
		    }
		    
		    
		   
		    
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}fis.close();

	}

}

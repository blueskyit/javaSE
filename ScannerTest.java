import java.util.Scanner;
 /* import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader; */
import java.io.*;
public class ScannerTest{
  public static void main (String[] args) 
  throws Exception
  /* {
     Scanner sc = new Scanner(System.in);
	System.out.println("������Long������");
	while (sc.hasNextLong()){
	  System.out.println("������������ݣ�"+sc.nextLong());
	} 
	Scanner fc = new Scanner(new File("C:/Users/C4/Desktop/bc.txt"));
	while(fc.hasNextLine()){
	  System.out.println(fc.nextLine());
	}
  */
  
  {
    BufferedReader br = new BufferedReader
    (new InputStreamReader(System.in));
    String line = null;
	while ((line = br.readLine()) !=null){
	  System.out.println("�û����������ǣ�"+line);
	}
  
  }
  
}
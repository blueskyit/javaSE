import java.util.Scanner;
public class Grank{
    public static void main(String args[]){
     System.out.println("请输入一个1-9999之间的整数");
	 Scanner in = new Scanner(System.in);
	 int f = in.nextInt();
	 int a=f/1000,b=f/100,c=f/10;
	 if(a>0){
	   System.out.println("this sum is four!");
	   }
	 else if(b>0){
	    System.out.println("this sum is three!");
	 }
	 else if(c>0){
        System.out.println("this sum is two!");	 
	 }
	 else{
	    System.out.println("this sum is one!");
	 }
	  while(f!=0){
            int g=f%10;
            System.out.print(g);
           f =f/10;
			}
	 if(g==f){
	   System.out.println("是回文数");
	 }
	 else {
	   System.out.println("不是回文数");
	 }
	}

}
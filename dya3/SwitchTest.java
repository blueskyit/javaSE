import java.util.Scanner;
public class SwitchTest{
   public static void main (String args[]){
    System.out.println("����ϲ���ĳ�");
	Scanner in = new Scanner(System.in);
	String car = in.next();
	switch(car){
	case "Benz":
	 System.out.println("Benz");
	 break;
	case "Tesla" :
	   System.out.println("Tesla");
	   break;
	case "Ford":
        System.out.println("Ford");
		break;
	default:
 System.out.println("Other car ");
        break ; 
		
	}
	in.close();
   }
}
import java.util.Arrays;
public class Suzu{
   public static void main(String args[]){
     int[] c ={1,3,5,7,9,};
	 int[] d = new int[2];		
	 d=c;
	 for(int b:c)
		System.out.println(b);
	c=Arrays.copyOf(c,2 * c.length);
	for(int f:c)
		System.out.println(f);
   }
}
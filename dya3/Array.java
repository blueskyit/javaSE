public class Array{
   public static void main(String args[]){
     int[] a=new int[100];
	 for(int i=0;i<100;i++){
	  a[i]=i+100;
	  System.out.println(a[i]);
	 }
	 System.out.println(a.length);
	 for(int c : a)
	 System.out.println(c);
   }
}
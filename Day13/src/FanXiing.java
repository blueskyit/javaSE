import java.awt.Component.BaselineResizeBehavior;

import org.omg.CORBA.PUBLIC_MEMBER;
 class Father<T>{}
 class Base<T>{}
public class FanXiing {
//   public static void test (Base<?> base){
//	   System.out.println("this is test");
//		
//	}
   
    
    
    public static void test (Father<? super Number> base){
 	   System.out.println("this is test");
 		
 	}
    
    public static void show (Father<? extends Number> base){
  	   System.out.println("this is show");
  		
  	}
    
     public static void main (String[] args){
    	Father<Integer>f1= new Father<>();
    	Father<Object>f2= new Father<>();
    	//test(f1);
    	test(f2);
    	show(f1);
    	//show(f2);
    }
    
}

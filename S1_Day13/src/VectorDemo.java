import java.util.Enumeration;
import java.util.Vector;


public class VectorDemo {
    static int s =0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(new Student("2011", "小一", "男", 17, 90));
		v.add(new Student("2012", "小二", "男", 16, 91));
		v.add(new Student("2013", "小三", "男", 15, 96));
		v.add(new Student("2014", "小四", "女", 15, 90));
		v.add(new Student("2015", "小五", "女", 15, 92));
    // System.out.println(v);
     Enumeration en = v.elements();
     while (en.hasMoreElements()) {
		Student  object = (Student) en.nextElement();
		
		System.out.println( object );
		
		 s+=object.getsJava() ;
		 }
		 float several = s/5;
		 System.out.println(several);//因为在此希望联系vector类，没有用更简单的Treeset类
		 

     
	}

}

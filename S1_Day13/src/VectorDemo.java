import java.util.Enumeration;
import java.util.Vector;


public class VectorDemo {
    static int s =0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(new Student("2011", "Сһ", "��", 17, 90));
		v.add(new Student("2012", "С��", "��", 16, 91));
		v.add(new Student("2013", "С��", "��", 15, 96));
		v.add(new Student("2014", "С��", "Ů", 15, 90));
		v.add(new Student("2015", "С��", "Ů", 15, 92));
    // System.out.println(v);
     Enumeration en = v.elements();
     while (en.hasMoreElements()) {
		Student  object = (Student) en.nextElement();
		
		System.out.println( object );
		
		 s+=object.getsJava() ;
		 }
		 float several = s/5;
		 System.out.println(several);//��Ϊ�ڴ�ϣ����ϵvector�࣬û���ø��򵥵�Treeset��
		 

     
	}

}

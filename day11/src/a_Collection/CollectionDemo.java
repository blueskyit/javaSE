package a_Collection;

import java.util.ArrayList;
import java.util.Collection;
public class CollectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  Collection coll = new ArrayList();
	  Collection co = new ArrayList();
	  coll.add("Google");
	  coll.add("Apple");
	  coll.add("Oracle");
	  
	  co.add("Baidu");
	  co.add("Alibaba");
	  co.add("Tencent");
	  System.out.println("����" + co);
	  System.out.println("����" + coll);
	  
	  //ɾ��
	  System.out.println(coll.remove("xiaomi"));
	  System.out.println(coll.remove("Apple"));
	  coll.add("xiaomi");
	  System.out.println(coll);
	  coll.removeAll(co);
	  System.out.println("����" + coll);
	  
	  
	  
	  
	}

}

package d_map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Person, String> hm = new HashMap<>();
		hm.put(new Person(100,"Ibm"), "USA");
		hm.put(new Person(15,"Alibaba"), "Hangzhou");
		hm.put(new Person(123,"Google"), "Sfanciso");
		hm.put(new Person(12,"Baidu"), "beijing");
		hm.put(new Person(12,"Baidu"), "suzhou ");
		
		Iterator<Person> it = hm.keySet().iterator();
//		while (it.hasNext()) {
//			Person pe =  it.next();
//			System.out.println(hm.get(new Person(12,"Baidu")));
//			System.out.println(pe);
//			
//		}
		Collection<Map.Entry<Person, String>> co = hm.entrySet();
		for( Map.Entry<Person, String> cc :co) {
			System.out.println(cc);
			
		}
		
		
	//System.out.println(hm);
	
	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.net.ssl.ExtendedSSLSession;



public class CollectionsDemo {
	
	
	
	public static void main(String[] args) {
		
//		List<String> list = new ArrayList<>();
//		list.add("baidu");
//		list.add("abcd");
//		list.add("java");
//		list.add("oracle");
//		list.add("google");
//		list.add("facebook");
//		
//		
//		for (String string : list) {
//			System.out.println(string);
//		}
//		System.out.println("===========");
//		Collections.sort(list);
//		for (String string : list) {
//			System.out.println(string);
//		}
//		
		
		List<Person> list2 = new ArrayList<>();
		list2.add(new Person(12,"android"));
		list2.add(new Person(1,"java"));
		list2.add(new Person(23,"baidu"));
		list2.add(new Person(23,"caidu"));
		list2.add(new Person(100,"IBM"));
		Collections.sort(list2);
		for (Person person : list2) {
			System.out.println(person);
		}
		System.out.println("=========++++");
		
		
	}

}

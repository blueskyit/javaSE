


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.security.auth.kerberos.KerberosKey;

import org.omg.CORBA.portable.ValueBase;

public class Ahh {
	public static void main(String[] args){
		Map<Integer, String> map=new HashMap<>();
		
		//1、添加元素
		map.put(null, "dd");
		System.out.println(map.put(null, "jj"));
		System.out.println(map.put(123, "张三丰"));//key不存在，返回null
		System.out.println(map.put(123, "李连杰"));//put 返回key上次对应value，覆盖原值
		map.put(124, "周润发");
		map.put(125, "周杰伦");
		map.put(126, "周大华");
		System.out.println(map);
		
		//删除元素
		System.out.println(map.remove(1));//key不存在，返回null
		System.out.println(map.remove(124));//存在，移除键值，并返回value
		System.out.println("=========");
		System.out.println(map);
		
	
	if(map.containsKey(124)){
		System.out.println("key 存在");
	}else{
		System.out.println("key 不存在");
	}
	if(map.containsValue("李连杰")){
		System.out.println("value 存在");
	}else{
		System.out.println("value 不存在");
	}
	
	/*5.遍历操作：Map无迭代器。
	 * a、得到key的set集合==》使用Set集合的迭代器，遍历key
	 * b、使用get+迭代器==》遍历value
	 */
//	Set<Integer> key_set =map.keySet();
//	System.out.println("=============");
//	for (Iterator<Integer> it = key_set.iterator(); it.hasNext();) {
//		Integer integer = (Integer) it.next();
//		System.out.println(integer);
//	}
//	
//	Collection<String> v_set = map.values();
//    Iterator<String> it = v_set.iterator();
//     while(it.hasNext()){
//  	     System.out.println("+++==============");
//    	 System.out.println(it.next());
//  }

	
     
//    Collection<String> value_co=map.values();
//	System.out.println("vvvvvvvvvvv");
//	for (Iterator iterator = value_co.iterator(); iterator.hasNext();) {
//		String str = (String) iterator.next();
//			System.out.println(str);
//	}

	  Set<Map.Entry<Integer, String>> entry_set = map.entrySet();
	  Iterator<Map.Entry<Integer, String>> it = entry_set.iterator();
	  while (it.hasNext()) {
		Map.Entry<Integer, String> entry =  it.next();
		Integer key = entry.getKey();
		String value = entry.getValue();
		System.out.println("++" + key+value);
		System.out.println(entry);
		
	}
	
  }
}
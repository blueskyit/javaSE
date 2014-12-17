package b_List;


import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List list = new ArrayList();
        list.add("Android-001");
        list.add("Android-002");
        list.add("Android-003");
        list.add("Android-004");
        list.add("Android-005");
        
        list.add(3,"Google");
        
        
        for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
        
        list.remove(3);
        //list.remove(10);
        
	}

}

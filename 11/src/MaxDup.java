
import java.util.HashMap;
import java.util.Map.Entry;

public class MaxDup {
     
      public static void main(String[] args) {        
          String str = "13913535174";
          HashMap<Character, Integer> map = new HashMap();
          Character maxChar = null;
          Integer maxCount = 0;
      
        for (Character c : str.toCharArray()) {
            if (map.containsKey(c)) { 
                map.put(c, map.get(c) + 1); 
            } else {
                map.put(c, 1);
            }
        }   
         
       
        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }   
        }
         
        System.out.println("Char:" + maxChar + "  Max:"  + maxCount);
      }
}


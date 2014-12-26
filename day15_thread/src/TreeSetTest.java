import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> ts1 =new TreeSet<>(new Comparator<Object>() {
			public int compare (Object fst , Object snd){
				return hashCode()>snd.hashCode() ? 1 
						: hashCode()<snd.hashCode() ? -1 :0;
						
			}
		});
		ts1.add("hello");
		ts1.add("wa");
		
		TreeSet<String> ts2 =new TreeSet<>(new Comparator<String>() {
			public int compare (String fst ,String snd){
				return fst.length()>snd.length() ? 1 
						: fst.length()<snd.length() ? -1 :0;
						
			}
		});
		ts2.add("hello");
		ts2.add("wa");
		ts2.add("baqq");
		
		System.out.println(ts1);
		System.out.println(ts2);
	}

}

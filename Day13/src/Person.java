import java.util.Comparator;

public class Person implements Comparable {

	private int age;
	private String name;

	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
 		int res = this.getAge() -p.getAge();
		
		if (res == 0)
			return this.getName().compareTo(p.getName());
		else
			return res;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "" + age  + name ;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	public Person() {
	
	}
}

package gem.javase;

class Person{
String name;
int age;
  public Person(){}
  public Person(String name ,int age){


    this.name = name;
    this.age = age; 
  }
  public String toString(){
    return "��дtostring:"+age+"\nage:"+age;
  }
  //ͬһ����� ���ԣ�
  public boolean equals(Object obj){
  
    if(this==obj){
	  return true;
	}
	
	boolean res = obj instanceof Person;
	if(res){
	  if(this.name==((Person)obj).name&&this.age==((Person)obj).age){
		return true;
	  }
	  else{
	  return false;
	  }
	  
	}
	else{
	  return false;
	}
	
  }
}



public class Test{
  public static void main(String[] args){
    Test test = new Test();
	System.out.println(test.getClass());
    System.out.println(test.toString());
	//ֱ�Ӵ�ӡ����ʱ����Ĭ�ϵ���tostring����
	System.out.println(test);
	Person p = new Person("Gem",12);
	Person p1 = new Person("goo",13);
	Person p2 = p1;
	System.out.println("  "+p.equals(p1)+"  "+(p==p1));
	System.out.println("  "+p2.equals(p1)+"  "+(p2==p1));
	System.out.println(p2.equals(p1));
	//System.out.println(p);
  }
}
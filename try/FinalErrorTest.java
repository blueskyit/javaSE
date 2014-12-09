public class FinalErrorTest{
   final int age;
  {
    //System.out.println(age);
	age = 6;
	System.out.println(age);
  }
  public static void main(String[] args){
    new FinalErrorTest();
  }
}
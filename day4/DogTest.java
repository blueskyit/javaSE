public class DogTest{
  public static void main(String args[]){
    Dog.type="Вищс";
	System.out.println("type="+Dog.type);
	Dog dog = new Dog(12,"Red");
	System.out.println("dog.type="+dog.type);
	System.out.println("Dog.type="+Dog.type);
	Dog dog2 = new Dog(15,"Blank");
	System.out.println("dog.age="+dog.age);
	System.out.println("dog2.age="+dog2.age);
  }
}
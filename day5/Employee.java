public class Employee{
  int id;
  String name;
  double salary;
  public void getName( String name){
 
    this.name=name;
  }
   public double getSalary(){
    return salary;
  }
   public void info(){
    System.out.println("id:"+id+"/n"+"name:"+name);
  }
 
}
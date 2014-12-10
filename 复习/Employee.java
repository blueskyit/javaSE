public class Employee{
   double salary;
  String name;
  int birthday;
  public void getName( String name){
 
    this.name=name;
	System.out.println(name);
	
  }
   public double getSalary(int month){
   if(month==birthday){
   this.salary = salary+100;
   } System.out.println("生日工资："+salary);
    return salary;
  }
   public void info(){
   
  }
 
}
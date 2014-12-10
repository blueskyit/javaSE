public class HourlyEmployee extends Employee{
  double HS;
  int time;
  public double getSalary(int time,int HS){
   if(time>160){
   super.salary = HS*time+(time-160)*0.5*HS;
   }
   else{super.salary = HS*time;}
    
	System.out.println("按时工资"+salary);
	return salary;
  }  
  
}
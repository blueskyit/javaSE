public class SalesEmployee extends Employee{
  double xs;
  float tc;
  public double getSalary(double xs,double tc){
     super.salary = xs*0.1*tc;
	 System.out.println("�޵�н����"+salary);
	 return salary;
  }
}
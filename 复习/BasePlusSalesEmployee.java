public class BasePlusSalesEmployee extends SalesEmployee{
  double dsalary;
   public double getSalary(double dsalary ,char f){
     super.salary = salary+dsalary;
	 System.out.println("¹Ì¶¨µ×Ð½¹¤×Ê"+salary);
	 return salary;
   }
}
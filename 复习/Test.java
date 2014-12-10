public class Test{
   public static void main(String[] args){
     SalariedEmployee man = new SalariedEmployee(10000);
	 HourlyEmployee man1 = new HourlyEmployee();
	 SalesEmployee man2 = new SalesEmployee();
	 BasePlusSalesEmployee man3 = new BasePlusSalesEmployee();
	 man.getName("name:SalariedEmployee");
	 man.getSalary();
	  man.birthday = 10;
	 man.getSalary(10);
	 
	 man.getName("name:HourlyEmployee");
	 man1.getSalary( 180, 50);
	 man1.birthday = 11;
	 man1.getSalary(11);
	
	 man.getName("name:SalesEmployee"); 
	 man2.getSalary( 100000, 1);
	 man2.birthday = 12;
	 man2.getSalary(12);
	 
	 man.getName("name:BasePlusSalesEmployee");
	 man3.getSalary( 100000, 1);
	 man3.getSalary(5000,'0');
	 man3.birthday = 12;
	 man3.getSalary(12);
	 
   }
}
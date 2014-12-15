package employee;

public class SalaryEmployee extends Employee {
    private double monthSalary;
   
    public SalaryEmployee() {
		
	}
	public SalaryEmployee(String name, double monthSalary, int birthMonth) {
		super(name,  birthMonth);
		this.monthSalary = monthSalary;
		
	}
	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return super.getSalary(month) + this.monthSalary;
	}
	

}

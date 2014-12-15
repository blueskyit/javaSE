package employee;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SalaryEmployee d = new SalaryEmployee("apple",10000.5,5);
    System.out.println(d.getName()+d.getSalary(5));
    System.out.println(d.getName()+d.getSalary(6));
	}

}

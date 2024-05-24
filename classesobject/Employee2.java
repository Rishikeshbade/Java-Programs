package classesobject;

public class Employee2 {
	int id;
	String name;
	double workingDays, PerDays, Salary;
	public Employee2() {
		id = 101;
		name = "Raj";
		PerDays = 1000;
		workingDays = 28;
		
	}
	public Employee2(int id, String name, double workingDays, double PerDays) {
		this.id = id;
		this.name = name;
		this.workingDays = workingDays;
		this.PerDays = PerDays;
	}
	public void calculate() {
		double Salary = workingDays*PerDays;
		System.out.println("Salary: "+Salary);
	}
	public static void main(String[] args) {
		Employee2 obj = new Employee2();
		obj.calculate();
		
		Employee2 obj1 = new Employee2(102,"Riya",29,900);
		obj1.calculate();
	}

}

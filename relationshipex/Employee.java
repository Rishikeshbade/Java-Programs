package relationshipex;

public class Employee extends Person {
	float perDay, workingDays, salary;
	
	public Employee() {
		super();
		perDay = 1200;
		workingDays = 18;
	}
	
	public Employee(int id, String name, MyDate dob, Address add, float perDay, float workingDays) {
		super(id, name, dob, add);
		this.perDay = perDay;
		this.workingDays = workingDays;
	}
	
	public void calculate() {
		salary = workingDays*perDay;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Salary: "+salary);
		
	}
}

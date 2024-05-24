package relationshipex;

public class SalesPerson extends Employee {

	float sales, commission, totalsalary;

	public SalesPerson() {
		super();
		sales = 70;
	}

	public SalesPerson(int id, String name, MyDate dob, Address add, float perDay, float wrokingDays, float sales) {
		super(id, name, dob, add, perDay, wrokingDays);
		this.sales = sales;

	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		if (sales > 95)
			commission = salary * 0.2f;
		else if (sales > 75)
			commission = salary * 0.15f;
		else if (sales > 60)
			commission = salary * 0.1f;
		else
			commission = 0;

		totalsalary = salary + commission;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("sales: " + sales);
		System.out.println("Commision: " + commission);
		System.out.println("Total Salary: " + totalsalary);

	}

}

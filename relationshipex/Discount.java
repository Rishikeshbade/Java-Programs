package relationshipex;

public class Discount extends Customer {
	double discount, finalAmount;
	
	public Discount() {
		super();
	}
	
	public Discount(int id, String name, MyDate dob, Address add, String prodName, double quantity, double price) {
		super(id, name, dob, add, prodName, quantity, price);
		this.discount = discount;
	}
	
	@Override
	public void calculate() {
		super.calculate();
		if(billAmount > 20000)
			discount = 0.15;
		else if(billAmount > 15000)
			discount = 0.1;
		else if(billAmount > 10000)
			discount = 0.07;
		else
			discount = 0.00;
		
		discount = billAmount*discount;
		finalAmount = billAmount - discount;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Discount: "+discount);
		System.out.println("Final Amount: "+finalAmount);
	}

}

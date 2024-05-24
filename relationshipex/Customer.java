package relationshipex;

public class Customer extends Person {
	String prodName;
	double quantity, price, billAmount;
	
	public Customer () {
		super();
		prodName = "prodName-1";
		quantity = 18;
		price = 3000;
	}
	
	public Customer(int id,String name, MyDate dob, Address add, String prodName, double quantity, double price) {
		super(id, name, dob, add);
		this.prodName = prodName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void calculate() {
		billAmount = quantity*price;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Product Name: "+prodName);
		System.out.println("Bill Amount: "+billAmount);
	}
	
	
}

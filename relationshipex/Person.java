package relationshipex;

public class Person {
	int id;
	String name;
	MyDate  dob;
	Address add;
	
	public Person() {
		id = 101;
		name = "Raj";
		dob = new MyDate();
		add = new Address();
	}
	
	public Person(int id, String name, MyDate dob, Address add) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.add = add;
		
	}
	
	public void display() {
		System.out.println("Person Id: "+id);
		System.out.println("Name: "+name);
		dob.display();
		add.display();
	}
}

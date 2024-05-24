package relationshipex;

public class StudentGrade extends Student {
	String grade;
	
	public StudentGrade() {
		super();
		grade = " ";
		
	}
	
	public StudentGrade(int id, String name, MyDate dob, Address add, float phy, float chem, float maths) {
		super(id, name, dob, add, phy, chem, maths);
		this.grade = grade;
	}
	
	@Override
	public void calculate() {
		super.calculate();
		if(percent > 90)
			grade = "A+";
		else if(percent > 75)
			grade = "A";
		else if(percent > 60)
			grade = "B+";
		else if(percent > 50)
			grade = "B";
		else
			grade = "F";
		
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Grade: "+grade);
	}

}

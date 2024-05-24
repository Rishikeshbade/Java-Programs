package abstraction;

import java.util.Scanner;

abstract class Marks{
	abstract float getpercentage();
}
class StudentA extends Marks{
	
	float phy,chem,maths;
	public StudentA(float phy, float chem,float maths) {
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
	}

	@Override
	float getpercentage() {
		// TODO Auto-generated method stub
		return (phy+chem+maths)/3;
	}

	
}

class StudentB extends Marks{
	float phy,chem,maths,eng;
	public StudentB(float phy, float chem, float maths, float eng) {
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
		this.eng = eng;
	}

	@Override
	float getpercentage() {
		// TODO Auto-generated method stub
		return (phy+chem+maths+eng)/4;
	}
	
}

public class TestMarks {

	public static void main(String[] args) {
		StudentA studentA;
		studentA = new StudentA(70, 78, 80);
		System.out.println("Percentage of Student A: "+studentA.getpercentage()+"%");
		
		StudentB studentB;
		studentB = new StudentB(70, 80, 82, 79);
		System.out.println("Percentage of Student B: "+studentB.getpercentage()+"%");
		
		
		

	}

}

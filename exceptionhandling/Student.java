package exceptionhandling;


public class Student {
	
	static void tofindRollNumber(int rollNumber) throws StudentNotFoundException{
		if(rollNumber >=1 && rollNumber <= 20)
			System.out.println("Student Found");
		else
			throw new StudentNotFoundException("Student not Found : "+rollNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			tofindRollNumber(25);
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("rest of code....");

	}

}

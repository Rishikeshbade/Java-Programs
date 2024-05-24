package classesobject;

public class StaticEx {
	int rollNumber;
	String name;
	static String instuteName = "EduBridge Learning";

	public StaticEx() {

	}

	public StaticEx(int rno, String nm) {
		rollNumber = rno;
		name = nm;
	}

	static {
		System.out.println("It is called before main()");
	}
	{
		System.out.println("Instance Block");
	}

	public void display() {
		System.out.println("Roll NO: " + rollNumber);
		System.out.println("Name: " + name);
		System.out.println("Institute Name: " + instuteName);
	}

	public static void ChangeName(String newInstitutName) {
		instuteName = newInstitutName;
	}

	public static void main(String[] args) {
		StaticEx.ChangeName("Edubridge Learning Pvt Ltd");

		 StaticEx Student1 = new StaticEx(101, "Sakshi");
		Student1.display();

		StaticEx Student2 = new StaticEx(102, "Suraj");
		Student2.display();
	}
}

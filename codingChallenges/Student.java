package codingChallenges;

public class Student {
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		Student s1 = new Student("A", 6);
		Classroom cm=new Classroom();
		System.out.println(cm.registerStudent(s1));
	}

}

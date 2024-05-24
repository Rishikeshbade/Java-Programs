package objectandwrapper;

public class Student implements Cloneable {
	
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(101, "Meera");
		Student s2 = (Student) s1.clone();
		System.out.println(s1);
		System.out.println(s2);

	}

}

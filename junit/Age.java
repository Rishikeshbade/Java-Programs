package junit;

public class Age {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public boolean ageChecker() {
		if(age >= 18)
			return true;
		else
			return false;
	}

}

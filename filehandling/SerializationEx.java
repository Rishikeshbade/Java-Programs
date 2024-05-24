package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	int rollNo;
	String Name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + "]";
	}

}

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		Student student = new Student(101, "Rishi");

		FileOutputStream outputStream = new FileOutputStream("C:\\java\\pqr.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(student);
		objectOutputStream.flush();
		System.out.println("Converted to Byte Stream");

	}

}

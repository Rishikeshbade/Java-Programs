package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\java\\pqr.txt"));
		Student student = (Student) objectInputStream.readObject();
		System.out.println(student);
		objectInputStream.close();

	}

}

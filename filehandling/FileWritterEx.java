package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritterEx {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("C:\\java\\xyz.txt", true);
		writer.write("File Writer Example");
		writer.close();
		System.out.println("File Created");

	}

}

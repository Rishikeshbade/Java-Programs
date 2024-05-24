package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream outputStream = new FileOutputStream("C:\\java\\abc.txt",true);
		String str = "Welcome to Pune!";
		byte bArr[] = str.getBytes();
		outputStream.write(bArr);
		outputStream.close();
		System.out.println("FILE CREATED");
	}

}

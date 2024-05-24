package filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:\\java\\xyz.txt");
		
		int i;
		
		while((i = reader.read())!=-1) {
			System.out.print((char)i);
		}
		
		reader.close();

	}

}

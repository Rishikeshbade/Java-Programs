package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.addElement("Jasmine");
		vector.add("Rose");
		vector.add("Lily");
		vector.add("Mogra");
		vector.add("Rose");
		vector.add(null);
		
		Enumeration<String> e = vector.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		

	}

}

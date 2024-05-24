package objectandwrapper;

public class AutoboxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		Integer obj1 = a;
		Integer obj3 = Integer.valueOf(a);
		Integer obj2 = new Integer(20);
		
		
		int b = obj2;
		int c = obj2.intValue();
	}

}

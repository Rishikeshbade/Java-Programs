package exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10/0;
			System.out.println("Div : "+a);
		}catch(ArithmeticException e) {
			//System.out.println(e);
			//System.err.println();
			e.printStackTrace();
		}
		System.out.println("rest of lines.....");
		
	}

}

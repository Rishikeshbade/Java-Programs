package loopingex;

public class Fibonacci {


	public static void main(String[] args) {
		int firstNumber = 0, secondNumber = 1 ,thirdNumber;
		System.out.println(firstNumber+" "+secondNumber+" ");
		for(int i=2;i<=10;i++) {
			thirdNumber = firstNumber+secondNumber;
			System.out.println("Fibonacci Series is: "+thirdNumber);
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
		
		

	}

	
}

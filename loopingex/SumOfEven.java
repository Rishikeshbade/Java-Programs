package loopingex;

public class SumOfEven {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 50; i<=100; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
				System.out.println("The Number is: "+sum);
			}
		}
		
	}
	}


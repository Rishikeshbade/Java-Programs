package loopingex;

public class BreakContinue {

	public static void main(String[] args) {
		int i;
		System.out.println("Break Example: ");
		for(i=1;i<=10;i++) {
			if(i==5)
				break;
			System.out.print(i+ " ");
			
		}
		
		System.out.println("\nContinue Example: ");
		for(i=1;i<=10;i++) {
			if(i==5)
				continue;
			System.out.print(i+ " ");
		
		}
	}

}

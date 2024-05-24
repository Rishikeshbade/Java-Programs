package arrayexample;

import java.util.Scanner;

public class AvgEvenOdd {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Array" + size + "size of Element: ");
		float i, sumEven = 0, sumOdd = 0, countEven = 0, countOdd = 0;
		
		
		for (i = 0; i < a.length; i++) {
			a[(int) i] = sc.nextInt();
		}
		for(i = 0; i<a.length; i++) {
			if(a[(int) i] % 2 == 0) {
				sumEven = sumEven + a[(int) i];  
				countEven++;
			}
			else {
				sumOdd = sumOdd + a[(int) i];
				countOdd++;
			}
		}
		if(countEven > 0) {
            float avgEven = sumEven/countEven;
            System.out.println("Average of even Numbers: " + avgEven);
        } else {
            System.out.println("No even numbers found.");
        }
        if(countOdd > 0) {
            float avgOdd = sumOdd/countOdd;
            System.out.println("Average of odd Numbers: " + avgOdd);
        } else {
            System.out.println("No odd numbers found.");
        }
		

	}

}

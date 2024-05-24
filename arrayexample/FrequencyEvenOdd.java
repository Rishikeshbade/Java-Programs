package arrayexample;

import java.util.Scanner;

public class FrequencyEvenOdd {

	public static void main(String[] args) {
			int size;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of Array: ");
			size = sc.nextInt();
			int a[] = new int[size];
			System.out.println("Array" + size + "size of Element: ");
			int i, sumEven = 0, sumOdd = 0, countEven = 0, countOdd = 0;
			for (i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int even = 0;
			int odd = 0;
			for(i = 0; i<a.length; i++) {
				if(a[i] % 2 == 0) {
					sumEven = sumEven + a[i];  
					countEven++;
					int avgEven = sumEven/countEven;
				}
				else {
					sumOdd = sumOdd + a[i];
					countOdd++;
					int avgOdd = sumOdd + a[i];
				}
			}
			System.out.println("Avrage of even Number: "+countEven+"\nAvrage of odd Number: "+countOdd);
			

		}

	}



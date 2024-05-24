package arrayexample;

import java.util.Scanner;

public class FrequencyPositiveNegative {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Array"+size+" size element: ");
		
		int p=0,n=0,zero=0;
		for(int i = 0;i<a.length;i++) {
			a[i] = sc.nextInt();
			if(a[i]>0)
				p++;
			else if(a[i]<0)
				n++;
			else
				zero++;
			
		}
		System.out.println("Postive:" +p+ "\nNegative:" +n+ "\nZero:"+zero);

	}

}

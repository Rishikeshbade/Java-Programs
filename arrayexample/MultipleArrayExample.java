package arrayexample;

import java.util.Scanner;

public class MultipleArrayExample {

	public static void main(String[] args) {
		int a[][]= {{1,2},{3,4}};
		int i , j = 0 ;
		for(i = 0; i < a.length;i++) {
			for(j = 0; j< a.length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		int rowsize, columnsize;
		Scanner sc = new 	Scanner(System.in);
		System.out.println("Enter Rowsize and ColumnSize: ");
		rowsize = sc.nextInt();
		columnsize = sc.nextInt();
		
		int b[][] = new int [rowsize][columnsize];
		
		int c[][] = new int[rowsize][columnsize];
		
		System.out.println("Enter Array Element: ");
		for(i=0;i<rowsize;i++)
			for(j=0;j<columnsize;j++) {
				b[i][j] = sc.nextInt();
			}
		for(i=0;i<rowsize;i++) {
			for(j=0;j<columnsize;j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Addition: ");
		for(i=0;i<rowsize;i++) {
			for(j=0;j<columnsize;j++) {
				System.out.print(a[i][j] + b[i][j]+ "\t");
			}
			System.out.println();
			}
	

	}

}

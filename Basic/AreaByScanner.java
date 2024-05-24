package Basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AreaByScanner {

	public static void main(String[] args) {
        int length,breadth,area,base,height, areat;
        float radius;
        float areac;
        // Scanner Method
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter length and breadth of Rectangle:");
         
         length = sc.nextInt();
         breadth = sc.nextInt();
         area = length*breadth;
         
         System.out.println("Area of Rectangle is :"+area);
         
         System.out.println("Enter Radius:");
         
         radius = sc.nextFloat();
         areac = 3.14f*radius*radius;
         
         System.out.println("Area of Circle is :"+areac);
         
         System.out.println("Enter base and height: ");
         
         base = sc.nextInt();
         height = sc.nextInt();
         areat = (int) (0.5f*base*height);
         
         System.out.println("Area of Triangle is : "+areat);
         
         //BufferedReader Method
         
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter Length and Breadth of Rectangle: ");
         length = sc.nextInt();
         breadth = sc.nextInt();
         area = length*breadth;
         System.out.println("Area of Rectangle is: "+area);
         
         System.out.println("Enter Radius of Circle: ");
         radius = sc.nextFloat();
         areac = 3.14f*radius*radius;
         System.out.println("Area of Circle is: "+areac);
         
         System.out.println("Enter base and height of Triangle: ");
         base = sc.nextInt();
         height = sc.nextInt();
         areat = (int) (0.5*base*height);
         System.out.println("Area of Triangle is: "+areat);
	}

}

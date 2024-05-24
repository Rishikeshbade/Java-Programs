package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product{
	int productId;
	String productName;
	float productPrice;
	public Product(int productId, String productName, float productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
	
}


public class LambdaInComparator {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product(101, "MousePad", 720));
		list.add(new Product(102, "KeyBoard", 1750));
		list.add(new Product(103, "Printer", 5600));
		list.add(new Product(104, "Laptop", 65000));
		list.add(new Product(105, "Pendrive", 1200));
		list.add(new Product(106, "Speaker", 8900));
		
		Collections.sort(list, (p1,p2)->{
			return p1.productName.compareTo(p2.productName);
		});
		
		list.forEach(p -> System.out.println(p));
		
		System.out.println("--------------------------------------------------------");
		
		Collections.sort( list, (p1, p2) -> {
			if (p1.productPrice == p2.productPrice) {
				return 0;
			} else if (p1.productPrice > p2.productPrice) {
				return 1;
			} else {
				return -1;
			}
		});
		
		list.forEach(p -> System.out.println(p));

	}

}

package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CrudOperation   {
	List<Product> list = new ArrayList<Product>();
	
	void AddProcduct() {
		list.add(new Product(1, "Apple", 100, "No Description"));
		list.add(new Product(2, "Mango", 120, "No Description"));
		list.add(new Product(3, "Grapes", 78, "No Description"));
		list.add(new Product(4, "Guava", 150, "No Description"));
		list.add(new Product(5, "Banana", 80, "No Description"));
		
		System.out.println(" List : ");
		for(Product li : list) {
			System.out.println(li);
		}
	}
	
	void UpdateProduct(int productId, String newName, float newPrice, String newDescription) {
		for(Product p : list) {
			if(p.getId() == productId) {
				p.setName(newName);
				p.setPrice(newPrice);
				p.setDescription(newDescription);
				System.out.println("Product Updated Successfully");
				
				for(Product li : list) {
					System.out.println(li);
				}
				System.out.println("------------------------------------------------------");
			}
		}
		
	}
	void deleteProduct(int productId) {
		for(Product p : list) {
			if(p.getId() == productId) {
				list.remove(p);
				
				for(Product li : list) {
					System.out.println(li);
				}
				System.out.println(" Product with ID " +productId+ " Deleted Successfully.. ");
			}
		}
	}
	
	void SortByPrice() {
		Collections.sort(list, Comparator.comparing(Product :: getPrice));
		System.out.println("Product Sorted by Price: ");
		for(Product li : list) {
			System.out.println(li);
		}
		
	}
	
	void SortByName() {
		Collections.sort(list, Comparator.comparing(Product :: getName));
		System.out.println("Product Sorted by Name");
		for(Product li : list) {
			System.out.println(li);
		}
	}

	public static void main(String[] args) {
		CrudOperation crud = new CrudOperation();
		crud.AddProcduct();
		crud.UpdateProduct(3, "WaterMelon", 79,"No Description" );
		crud.deleteProduct(4);
		crud.SortByPrice();
		crud.SortByName();
	}

}

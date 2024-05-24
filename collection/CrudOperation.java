package collection;

import java.util.ArrayList;
import java.util.List;




public class CrudOperation {
	
	
		List<String> lists = new ArrayList<>();
		public void creat() {
		lists.add("Apple");
		lists.add("Banana");
		lists.add("Orange");
		lists.add("Mango");
		
		System.out.println(" List : ");
		for(String list : lists) {
			System.out.println(list);
		}
	}
	
	public void indexUpdate() {
		int   index = 2;
		if(index >= 0 && index < lists.size()) {
			lists.set(index, "Kiwi");
			System.out.println("list of index "+index+" Upadted Lists.");
		}
		else {
			System.out.println("Inavild");
		}
		System.out.println(" List : ");
		for(String list : lists) {
			System.out.println(list);
		}
	}

	public void delete() {
		int delete = 0;
		if(delete >= 0 && delete < lists.size()) {
			lists.remove(delete);
			System.out.println("Element at index " + delete + " deleted.");
		}
		System.out.println(" List : ");
		for(String list : lists) {
			System.out.println(list);
		}
		
		
	}

	public static void main(String[] args){
		
		CrudOperation demo = new CrudOperation();
		demo.creat();
		demo.indexUpdate();
		demo.delete();
		
		

		
		

	}

}

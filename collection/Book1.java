package collection;

 class Book1 implements Comparable<Book1>{
	
	int id;
	String name,author,publisher;
	int quantity;
	public Book1(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	public int compareTo(Book1 b) {
		if(id > b.id) {
			return 1;
		}
		if(id < b.id) {
			return -1;
		}
		else {
			return 0;
		}
	}

	
	
	
	
	
	

}

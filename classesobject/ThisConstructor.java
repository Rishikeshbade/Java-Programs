package classesobject;

public class ThisConstructor {
	String str;
	int n;
	
	public ThisConstructor() {
		this("Hello World!!");
	}
	public ThisConstructor(String str) {
		this(10);
		this.str = str;
	}
	public ThisConstructor(int n) {
		this.n = n;
	}
	public void print() {
		System.out.println(n+" "+str);
	}
	
 
	public static void main(String[] args) {
		ThisConstructor obj = new ThisConstructor();
		obj.print();
		
	}
}

package classesobject;


public class MethodOverloadindEx {
	public void area(float radius) {
		System.out.println("Area of Cricle: "+(3.14*radius*radius));
	}
	public int area(int length, int breadth) {
		return length*breadth;
	}
	
	public static void main(String[] args) {
		MethodOverloadindEx obj = new MethodOverloadindEx();
		obj.area(9);
		int res = obj.area(5, 8);
		System.out.println("Area of Rectangle: "+res);
	}
}

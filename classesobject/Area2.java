package classesobject;

public class Area2 {
	double length, breadth;
	
	public Area2() {
		length = 5;
		breadth = 6;
	}
	public Area2 (double length,double breadth) {
		this.length = length;
		this.breadth = breadth;
		
	}
	public void calculate() {
		double Area = length*breadth;
		System.out.println("Area of rectangle: "+Area);
	}
	public static void main(String[] args) {
		Area2 obj = new Area2();
		obj.calculate();
		
		Area2 obj2 = new Area2(7,8);
		obj2.calculate();
	}
}

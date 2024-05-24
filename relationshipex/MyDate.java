package relationshipex;

public class MyDate {
	int dd,mm,yy;
	
	public MyDate() {
		dd = 12;
		mm = 4;
		yy = 1994;
	}
	
	public MyDate(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void display() {
		System.out.println(dd+"-"+mm+"-"+yy);
	}
}

package arrayexample;


public class Source {
	public int getSecondHighest(int[]arr) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int n:arr) {
			if(n > secondHighest) {
				secondHighest = highest;
				highest = n;
			}else if(n > highest){
				highest = n;
			}
		}
		return secondHighest;
	}
	public static void main(String[] args) {
		int []arr = {32,54,76,87,98};
		int []arr1 = {34,45,56,67,78};
		Source obj = new Source();
		int seconHighest = obj.getSecondHighest(arr);
		System.out.println("Secon Highest Number is: "+seconHighest);
		
		int secondHighest1 = obj.getSecondHighest(arr1);
		System.out.println("Second Highest Number is: "+secondHighest1);
		
		
	}
}

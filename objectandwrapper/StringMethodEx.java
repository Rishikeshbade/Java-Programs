package objectandwrapper;

public class StringMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hello");
		System.out.println(str1);
		
		String s1 = "welcome";
		System.out.println(s1);
		
		String s2 = "Hello" , s3 = "welcome",s4 = "         Welcome to EduBridge      ";
		System.out.println("char at 3rd position : "+s1.charAt(3));
		
		System.out.println("Length : "+s4.length());
		
		System.out.println("substring(3) : "+s1.substring(3));
		
		System.out.println("substring(1,4) : "+s1.substring(1, 4));
		
		System.out.println("si.contain(e) : "+s1.contains("e"));
		
		System.out.println("s1.contain(x) : "+s1.contains("come"));
		
		System.out.println("s1.equals(s3) : "+s1.equals(s3));
		
		System.out.println("s2.equalsIgnoreCase(s3) : "+s1.equalsIgnoreCase(s3));
		
		System.out.println("s2.isEmpty(): "+s2.isEmpty());
		
		System.out.println("s3.indexOf(e): "+s3.indexOf("e"));
		
		System.out.println("s3.lastIndexOf(e) :"+s3.lastIndexOf("e"));
		
		System.err.println("uppercase: "+s3.toUpperCase());
		System.out.println("lowercase: "+s3.toLowerCase());
		
		
	}

}

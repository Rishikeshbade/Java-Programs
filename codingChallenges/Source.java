package codingChallenges;


@FunctionalInterface
interface Authentication{
	boolean authenticate(String userName, String pasword);
}


public class Source {
	
	public boolean Validate(String userName, String password ) {
		Authentication auth = (a, b) -> a.equals("ABC") && b.equals("DEF");
		return auth.authenticate(userName, password);
		
	}
	
		
	public static void main(String[] args) {
		String str = " ";
		Source s = new Source();
		String splitedStr[] = str.split(" ");
		System.out.println(s.Validate("Alexa", "coded123"));
	}

}

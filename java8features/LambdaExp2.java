package java8features;

@FunctionalInterface
interface Sayable{
	String say(String str);
}

public class LambdaExp2 {

	public static void main(String[] args) {
		Sayable s1 = (name) -> "Hello "+name;
		System.out.println(s1.say("Rishikesh!"));
		
		Sayable s2 = (msg) -> {
			return "Message : "+msg;
		};
		System.out.println(s2.say("Learning Java 8 Features!!!"));

	}

}

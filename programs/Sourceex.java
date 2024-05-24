package programs;

import java.util.Scanner;

public class Sourceex {
	public boolean validate(String username, String password) {
        return authenticate(username, password);
    }

    private boolean authenticate(String username, String password) {
        Authentication auth = (u, p) -> u.equals("ABC") && p.equals("DEF");
        return auth.authenticate(username, password);
    }

    @FunctionalInterface
	public interface Authentication {
        boolean authenticate(String username, String password);
    }

    public static void main(String[] args) {
        Sourceex source = new Sourceex();
   
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
   
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        
        System.out.print("Validation Result: " + source.validate(username, password));
        
    }

}

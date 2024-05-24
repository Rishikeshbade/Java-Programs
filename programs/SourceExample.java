package programs;

import programs.Sourceex.Authentication;

public class SourceExample {
	public boolean validate(String username, String password) {
        return authenticate(username, password);
    }

    private boolean authenticate(String username, String password) {
        Authentication auth = (u, p) -> u.equals("ABC") && p.equals("DEF");
        return auth.authenticate(username, password);
    }

    @FunctionalInterface
    private interface Authentication {
        boolean authenticate(String username, String password);
    }
}
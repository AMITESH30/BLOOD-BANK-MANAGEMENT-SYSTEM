package BloodBankManagementSystem;

import BloodBankManagementSystem.Login;

public class UserAuthentication {
    private static final String VALID_USERNAME = "bbms";
    private static final String VALID_PASSWORD = "12345678";

    public static void authenticate(String username, String password) throws InvalidCredException {
        if (!username.equals(VALID_USERNAME) || !password.equals(VALID_PASSWORD)) {
            throw new InvalidCredException("Incorrect username or password");
        }
        if (password.length()  < 7) {
            throw new InvalidCredException("Password must be at least 8 characters long");
        }
        // if authentication successful, save user info or perform other actions here
    }
}
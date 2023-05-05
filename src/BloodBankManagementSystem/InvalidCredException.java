package BloodBankManagementSystem;

public class InvalidCredException extends Exception {
    public InvalidCredException(String errorMessage) {
        super(errorMessage);
    }
}
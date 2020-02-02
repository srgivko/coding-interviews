package Vending_Machine;

public class NotSufficientChangeException extends RuntimeException {
    public NotSufficientChangeException(String message) {
        super(message);
    }
}

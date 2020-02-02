package Vending_Machine;

public class NotFullPaidException extends RuntimeException {

    public NotFullPaidException(String message) {
        super(message);
    }
}

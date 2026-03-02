package inclass.mar22.Exception.ThrowThrows;

public class InvalidBalanceException extends RuntimeException {

    public InvalidBalanceException(String UserHaveLowBalance) {
        super(UserHaveLowBalance);
    }
}

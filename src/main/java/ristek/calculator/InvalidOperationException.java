package ristek.calculator;

public class InvalidOperationException extends Exception {

  // @param errorMessage is the error message

    public InvalidOperationException(String errorMessage) {
        super(errorMessage);
    }
}

package ristek.calculator;

public class InvalidOperationException extends RuntimeException {

  // @param errorMessage is the error message

  public InvalidOperationException(String errorMessage) {
    super(errorMessage);
  }
}

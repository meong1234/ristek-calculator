package ristek.calculator;

public class Calculator {
  public final static String[] validOperations = {
    "add",
    "substract",
    "multiply",
    "divide",
  };

  public int add(int x, int y) {
    return x + y;
  }
  public int substract(int x, int y) {
    return x - y;
  }
  public int multiply(int x, int y) {
    return x * y;
  }
  public int divide(int x, int y) {
    return x / y;
  }

  public static void ensureValidOperation(String operation) throws InvalidOperationException {
    for (String validOperation : validOperations) {
      if (operation == validOperation) {
        return;
      }
    }
    throw new InvalidOperationException(
        "Operation is invalid, please input the following: " +
        String.join(", ", validOperations));
  }
}

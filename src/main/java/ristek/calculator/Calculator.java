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

  public static boolean isInvalidOperation(String operation) {
    for (String validOperation : validOperations) {
      if (operation == validOperation) {
        return false;
      }
    }
    return true;
  }
}

package ristek.calculator;

public class Calculator {
  private final static String[] validOperations = {
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

  public static boolean isValidOperation(String operation) {
    for (String validOperation : validOperations) {
      if (operation == validOperation) {
        return true;
      }
    }
    return false;
  }
}

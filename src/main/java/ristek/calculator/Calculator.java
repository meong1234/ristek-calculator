package ristek.calculator;

public class Calculator {
  // List of valid operations
  public final static String[] validOperations = {
    "add",
    "substract",
    "multiply",
    "divide",
  };

  // Add two values
  //
  // @params x - first operand
  // @params y - second operand
  // @return addition of two operands
  //
  public int add(int x, int y) {
    return x + y;
  }

  // Substract two values
  //
  // @params x - first operand
  // @params y - second operand
  // @return substraction of two operands
  //
  public int substract(int x, int y) {
    return x - y;
  }

  // Multiply two values
  //
  // @params x - first operand
  // @params y - second operand
  // @return multiplication of two operands
  //
  public int multiply(int x, int y) {
    return x * y;
  }

  // Divide two values
  //
  // @params x - first operand
  // @params y - second operand
  // @return division of two operands
  //
  public int divide(int x, int y) {
    return x / y;
  }

  // Ensure operation is valid
  //
  // @params operation - operation that is going to be applied to the operands
  //
  public static void ensureValidOperation(String operation) throws InvalidOperationException {
    for (String validOperation : validOperations) {
      if (operation.equals(validOperation)) {
        return;
      }
    }
    throw new InvalidOperationException(
        "Operation is invalid, please input the following: " +
        String.join(", ", validOperations));
  }
}

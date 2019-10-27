package ristek.calculator;

public class App {
  public static void main(String[] args) {
    // Initialize Calculator
    Calculator calculator = new Calculator();

    try {
      // Ensure inputs are valid
      String operation = args[0];
      Calculator.ensureValidOperation(operation);

      int firstInput = Integer.parseInt(args[1]);
      int secondInput = Integer.parseInt(args[2]);

      switch (operation) {
        case "add":
          System.out.print(calculator.add(firstInput, secondInput));
          break;
        case "substract":
          System.out.print(calculator.substract(firstInput, secondInput));
          break;
        case "multiply":
          System.out.print(calculator.multiply(firstInput, secondInput));
          break;
        case "divide":
          System.out.print(calculator.divide(firstInput, secondInput));
          break;
      }
    } catch (InvalidOperationException e) {
      System.out.print(e.getMessage());
    } catch (NumberFormatException e) {
      System.out.print(e.getMessage());
    }
  }
}

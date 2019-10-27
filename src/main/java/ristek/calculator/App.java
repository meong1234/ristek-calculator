package ristek.calculator;

public class App {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    try {
      String operation = args[0];
      Calculator.ensureValidOperation(operation);

      int firstInput = 0;
      int secondInput = 0;
      firstInput = Integer.parseInt(args[1]);
      secondInput = Integer.parseInt(args[2]);

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
      System.out.print(e);
    } catch (NumberFormatException e) {
      System.out.print(e);
    }
  }
}

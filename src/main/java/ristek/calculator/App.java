package ristek.calculator;

public class App {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    String operation = args[0];
    if (Calculator.isInvalidOperation(operation)) {
      System.out.print("Operation input is invalid, expects " + Calculator.validOperations);
      return;
    }

    int firstInput, secondInput;
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
  }
}

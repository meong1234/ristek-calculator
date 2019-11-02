package ristek.calculator;

import ristek.calculator.command.CalculatorCommand;

public class App {
  public static void main(String[] args) {
    try {
      // Ensure inputs are valid
      String operation = args[0];
      int firstInput = Integer.parseInt(args[1]);
      int secondInput = Integer.parseInt(args[2]);

      CalculatorCommand cmd = Calculator.getCallculatorCommand(operation);
      int result = cmd.execute(firstInput, secondInput);
      System.out.print(result);

    } catch (InvalidOperationException e) {
      System.out.print(e.getMessage());
    } catch (NumberFormatException e) {
      System.out.print("Invalid number format, " + e.getMessage());
    }
  }
}

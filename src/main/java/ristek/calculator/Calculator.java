package ristek.calculator;

import ristek.calculator.command.*;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
  private static Map<String, CalculatorCommand> commandMap = new HashMap<>();

  static {
    commandMap.put("add", new AddCommand());
    commandMap.put("substract", new SubstractCommand());
    commandMap.put("multiply", new MultiplyCommand());
    commandMap.put("divide", new DivideCommand());
  }

  public static CalculatorCommand getCallculatorCommand(String command) {
    return commandMap.getOrDefault(command, new UnknownCommand());
  }
}

package ristek.calculator.command;

import ristek.calculator.InvalidOperationException;

public class UnknownCommand implements CalculatorCommand {
    @Override
    public int execute(int x, int y)  {
        throw new InvalidOperationException("command not implemented");
    }
}

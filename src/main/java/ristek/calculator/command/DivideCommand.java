package ristek.calculator.command;

public class DivideCommand implements CalculatorCommand {
    @Override
    public int execute(int x, int y) {
        return x / y;
    }
}

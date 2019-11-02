package ristek.calculator.command;

public class MultiplyCommand implements CalculatorCommand {
    @Override
    public int execute(int x, int y) {
        return x * y;
    }
}

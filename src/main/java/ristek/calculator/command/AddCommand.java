package ristek.calculator.command;

public class AddCommand implements CalculatorCommand {
    @Override
    public int execute(int x, int y) {
        return x + y;
    }
}

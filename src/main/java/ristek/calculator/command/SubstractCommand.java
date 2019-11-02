package ristek.calculator.command;

public class SubstractCommand implements CalculatorCommand {
    @Override
    public int execute(int x, int y) {
        return x - y;
    }
}

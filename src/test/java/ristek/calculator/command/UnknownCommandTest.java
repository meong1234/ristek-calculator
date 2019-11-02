package ristek.calculator.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ristek.calculator.InvalidOperationException;

class UnknownCommandTest {
    @Test()
    @DisplayName("Calculator Unknown Test")
    void addTest() {
        CalculatorCommand cmd = new UnknownCommand();
        Assertions.assertThrows(InvalidOperationException.class, () -> {
            cmd.execute(2, 1);
        });
    }
}
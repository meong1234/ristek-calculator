package ristek.calculator.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MultiplyCommandTest {
    @Test
    @DisplayName("Calculator Multiply Test")
    void addTest() {
        CalculatorCommand cmd = new MultiplyCommand();
        Assertions.assertEquals(4, cmd.execute(2, 2));
    }
}
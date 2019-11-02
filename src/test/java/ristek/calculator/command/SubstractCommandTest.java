package ristek.calculator.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SubstractCommandTest {
    @Test
    @DisplayName("Calculator Substract Test")
    void addTest() {
        CalculatorCommand cmd = new SubstractCommand();
        Assertions.assertEquals(1, cmd.execute(2, 1));
    }
}
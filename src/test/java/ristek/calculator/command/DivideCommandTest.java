package ristek.calculator.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DivideCommandTest {
    @Test
    @DisplayName("Calculator Divide Test")
    void addTest() {
        CalculatorCommand cmd = new DivideCommand();
        Assertions.assertEquals(1, cmd.execute(2, 2));
    }
}
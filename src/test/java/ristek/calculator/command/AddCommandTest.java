package ristek.calculator.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AddCommandTest {
    @Test
    @DisplayName("Calculator Add Test")
    void addTest() {
        CalculatorCommand addCommand = new AddCommand();
        Assertions.assertEquals(2, addCommand.execute(1, 1));
    }
}
package ristek.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Test")
class CalculatorTest {
  private final Calculator calculator = new Calculator();

  @Test
  @DisplayName("Calculator Add Test")
  void addTest() {
    assertEquals(2, calculator.add(1, 1));
  }

  @Test
  @DisplayName("Calculator Substract Test")
  void substractTest() {
    assertEquals(0, calculator.substract(1, 1));
  }

  @Test
  @DisplayName("Calculator Divide Test")
  void divideTest() {
    assertEquals(1, calculator.divide(2, 2));
  }

  @Test
  @DisplayName("Calculator Multiply Test")
  void multiplyTest() {
    assertEquals(4, calculator.multiply(2, 2));
  }
}

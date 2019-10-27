package ristek.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Assertions;

@DisplayName("Calculator Test")
class CalculatorTest {
  private final Calculator calculator = new Calculator();

  @Test
  @DisplayName("Calculator Add Test")
  void addTest() {
    Assertions.assertEquals(2, calculator.add(1, 1));
  }

  @Test
  @DisplayName("Calculator Substract Test")
  void substractTest() {
    Assertions.assertEquals(0, calculator.substract(1, 1));
  }

  @Test
  @DisplayName("Calculator Divide Test")
  void divideTest() {
    Assertions.assertEquals(1, calculator.divide(2, 2));
  }

  @Test
  @DisplayName("Calculator Multiply Test")
  void multiplyTest() {
    Assertions.assertEquals(4, calculator.multiply(2, 2));
  }

  @Nested
  @DisplayName("Calculator isValidOperation Tests")
  class isValidOperationTests {
    @Test
    @DisplayName("Valid Test")
    void validTest() {
      Assertions.assertTrue(Calculator.isValidOperation("add"));
    }

    @Test
    @DisplayName("Invalid Test")
    void invalidTest() {
      Assertions.assertFalse(Calculator.isValidOperation("foo"));
    }
  }
}

package ristek.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Invalid Operation Exception Test")
class InvalidOperationExceptionTest {
  // Testing if there are no errors when throwing the class
  @Test
  void InvalidOperationExceptionTest() {
    Assertions.assertThrows(InvalidOperationException.class, () -> {
      throw new InvalidOperationException("test");
    });
  }
}

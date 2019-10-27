package ristek.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Invalid Operation Exception Test")
class InvalidOperationExceptionTest {
  @Test
  void InvalidOperationExceptionTest() {
    Assertions.assertThrows(InvalidOperationException.class, () -> {
      throw new InvalidOperationException("test");
    });
  }
}

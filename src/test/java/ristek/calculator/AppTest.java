package ristek.calculator;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class AppTest {
  // Stub stdout and stderr
  private ByteArrayOutputStream testStdout;
  private ByteArrayOutputStream testStderr;
  private final PrintStream originalStdout = System.out;
  private final PrintStream originalStderr = System.err;

  // Stubs are made fresh each test
  @BeforeEach
  void stubOutput() {
    testStdout = new ByteArrayOutputStream();
    testStderr = new ByteArrayOutputStream();
    System.setOut(new PrintStream(testStdout));
    System.setErr(new PrintStream(testStderr));
  }

  // Stubs are cleaned up after
  @AfterEach
  void restoreOutput() {
    System.setOut(originalStdout);
    System.setErr(originalStderr);
  }

  @Test
  @DisplayName("Valid Test")
  void validOperationTest() {
    String[] validArgs = {"add", "1", "1"};
    App.main(validArgs);
    Assertions.assertEquals("2", testStdout.toString());
  }

  @Test
  @DisplayName("Invalid Operation Test")
  void invalidOperationTest() {
    String[] validArgs = {"foo", "1", "1"};
    App.main(validArgs);
    Assertions.assertEquals(
        "command not implemented",
        testStdout.toString());
  }

  @Test
  @DisplayName("Invalid Number Format Test")
  void invalidNumberFormatTest() {
    String[] validArgs = {"add", "bar", "baz"};
    App.main(validArgs);
    Assertions.assertEquals(
        "Invalid number format, For input string: \"bar\"",
        testStdout.toString());
  }
}

package ristek.calculator;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class AppTest {
  private final static ByteArrayOutputStream testStdout = new ByteArrayOutputStream();
  private final static ByteArrayOutputStream testStderr = new ByteArrayOutputStream();
  private final static PrintStream originalStdout = System.out;
  private final static PrintStream originalStderr = System.err;

  @BeforeAll
  static void stubOutput() {
    System.setOut(new PrintStream(testStdout));
    System.setErr(new PrintStream(testStderr));
  }

  @AfterAll
  static void restoreOutput() {
    System.setOut(originalStdout);
    System.setErr(originalStderr);
  }

  @Test
  @DisplayName("Valid Operation Test")
  void validOperationTest() {
    String[] validArgs = {"add", "1", "1"};
    App.main(validArgs);
    Assertions.assertEquals("2", testStdout.toString());
  }
}

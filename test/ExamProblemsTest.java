import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class ExamProblemsTest {

  @ParameterizedTest
  @CsvFileSource(resources = "data.csv")
  void removeSpaces() {


  }

  @Test
  void reverse() {
  }

  @ParameterizedTest(name = "{index} => input ={0}, expected={1}, exceptions={2}")
  @CsvFileSource(resources = "data.csv", delimiter = ' ')
  void perfectSquare(long input, long expected,long exception) {

    assertEquals(expected, ExamProblems.perfectSquare(input));
    assertThrows(IllegalArgumentException.class, ()-> ExamProblems.perfectSquare(exception));

  }

  @ParameterizedTest
  @CsvFileSource(resources = "ssn.csv")
  void ssnstring(String expected, char[] ssn ) {
//    char[] ssnparam = {'1','2','3','4','5','6','7','8','9'};
//    String expected = "123-45-6789";
    assertEquals(expected, ExamProblems.ssnstring(ssn));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "dna.csv")
  void makePair(String expected, String dna) {
    assertEquals(expected, ExamProblems.makePair(dna));
  }
}
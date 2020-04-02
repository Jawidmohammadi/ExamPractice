import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

class ExamProblems3Test {


  @Test
  void integervalue() {


  }

  @ParameterizedTest
  @CsvFileSource(resources = "dataa.csv")
  void exchange(String roman,int  expected ) {

    assertEquals(expected, ExamProblems3.exchange(roman));

  }

  @Test
  void pairs() {
  }

  


  @ParameterizedTest
  @MethodSource
  void triple() {


  }
}
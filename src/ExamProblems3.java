import java.util.HashSet;
import java.util.Set;

public class ExamProblems3 {


    public static int integervalue(char romanValue){
      switch (romanValue){
        case 'I':
          return 1;
        case 'V':
          return 5;
        case 'X':
          return 10;
        case 'L':
          return 50;
        case 'C':
          return 100;
        case 'D':
          return 500;
        case 'M':
          return 1000;
        default:
          return 0;
      }
    };

    public static int exchange(String roman){

      int result = 0;
      String romanNumeral = roman.toUpperCase();

      for (int i = 0; i < romanNumeral.length()-1; i++) {
        if (integervalue(romanNumeral.charAt(i)) < integervalue(romanNumeral.charAt(i+1))){
          result -=integervalue(romanNumeral.charAt(i));
        }
        else {
          result +=integervalue(romanNumeral.charAt(i));
        }
      }
      result += integervalue(romanNumeral.charAt(romanNumeral.length()-1));
      return result;
    }


  public static Set<Set<Integer>> pairs(int[] values) {
    Set<Set<Integer>> result = new HashSet<>();
    for (int i = 0; i < values.length-1; i++) {
      for (int j = i+1; j < values.length ; j++) {
        if (values[i]+values[j] == 0){
          Set<Integer> pair = new HashSet<>();
          pair.add(values[i]);
          pair.add(values[j]);
          result.add(pair);
        }
      }
    }
    return result;
  }


  public static Set<Set<Integer>> triple(int[] values) {
    Set<Set<Integer>> result = new HashSet<>();
    for (int i = 0; i < values.length-1; i++) {
      for (int j = i + 1; j < values.length; j++) {
        for (int k = j + 1; k < values.length; k++) {
          if (values[i] + values[j] + values[k] == 0) {
            Set<Integer> triple = new HashSet<>();
            triple.add(values[i]);
            triple.add(values[j]);
            triple.add(values[k]);
            result.add(triple);
          }
        }
      }
    }
    return result;
  }


  }




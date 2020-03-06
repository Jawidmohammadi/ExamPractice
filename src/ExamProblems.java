public class ExamProblems {

  // String Processing
  public static String removeSpaces(String args){

    char[] array = args.toCharArray();

    int lastchar =  args.charAt(args.length()-1);
    int firstchar = args.charAt(0);

    for (int i = 0; i < array.length; i++){

      if(array[i] != ' '){
        firstchar =  i;
      break;
      }
    }

    for (int i = array.length-1; i > firstchar ; i--) {
      if (array[i] != ' '){
        lastchar = i;
        break;
      }

    }
    return args.substring(firstchar, lastchar + 1);
  }

  public static String reverse(String str){

    if (str == null || str.equals(""))
      return str;

    int n = str.length();
    int j = n - 1;

    char[] temp = new char[n];
    for (int i = 0; i <= j ; i++) {
      temp[j] = str.charAt(i);
      temp[i] = str.charAt(j);
      j--;
    }
    return String.copyValueOf(temp);
  }

  public static long perfectSquare(long input) throws IllegalArgumentException {
    if (input<0){
      throw new IllegalArgumentException();
    }
    long perfectSquaree =(long) (Math.sqrt(input));
    return (perfectSquaree+1)*(perfectSquaree+1);
  }

  public static String ssnstring(char[] ssn){
    String output = new String(ssn);
    output = output.substring(0,3) + "-" + output.substring(3,5) + "-" + output.substring(5);
    return output;
  }
//
  public static String makePair(String dna){

    dna = dna.replaceAll("[A]","R");
    dna = dna.replaceAll("[T]", "A");
    dna = dna.replaceAll("[R]", "T");

    dna = dna.replaceAll("[C]", "B");
    dna = dna.replaceAll("[G]", "C");
    dna = dna.replaceAll("[B]", "G");

    return dna;

  }


}



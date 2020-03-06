import org.w3c.dom.ls.LSOutput;

public class Main {

  public static void main (String[] args){
    String result = ExamProblems.removeSpaces("Cool Test Value");
    System.out.println(result);

    String str = "Reverse me!";

    str = ExamProblems.reverse(str);
    System.out.println("Reversed string is: " + str);


}
}
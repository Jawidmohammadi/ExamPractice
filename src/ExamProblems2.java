public class ExamProblems2 {
  public static void main(String[] args){
    int[] intarray = new int[100];

    for (int i = 0; i < 100 ; i++) {
      intarray[i] = i;
    }

  }

  static void printArray(int[] array){
    for(int i: array){
      System.out.println(i + " ");
    }
  }
  static int[] slice (int[] array, int to, int from, int stride){
    int newLength = ((to - from ) / stride) + (((to - from) % stride)== 0 ? 0 : 1);
    int[] newInt = new int[newLength];

    int iterator = 0;
    for (int i = from; i < to ; i+= stride) {
      newInt[iterator++] = array[i];
    }
    return newInt;
  }

}

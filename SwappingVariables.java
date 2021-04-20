import java.util.Scanner;

public class LabProgram {
   
   public static void swapValues(int[] values) {
      int placeHolder;
      
      placeHolder = values[0];
      values[0] = values[1];
      values[1] = placeHolder;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int input;
      int i;
      
      int[] array = new int[2];
      
      for(i=0; i<2; ++i) {
       input = scnr.nextInt();
       array[i] = input;
      }
      
      swapValues(array);
      
     System.out.print(array[0] + " ");
   
     System.out.print(array[1]);
     System.out.println();
   }
}

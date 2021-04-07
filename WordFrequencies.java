import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      int arraySize;
      int i;
      int counter = 0;
      int j;
      
      arraySize = scnr.nextInt();
      
      String array[] = new String[arraySize];
      
      for (i = 0; i < arraySize; ++i) {
         array[i] = scnr.next();
      }
      for (i = 0; i < arraySize; ++i) {
         for (j = 0; j < arraySize; ++j) {
            if (array[i].equals(array[j])) {
               ++counter;
            }
         }
         System.out.println(array[i] + " " + counter);
         counter = 0;
      }   
   }
}

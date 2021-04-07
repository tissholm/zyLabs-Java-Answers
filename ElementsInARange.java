import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arraySize;
      int upperBound;
      int lowerBound;
      int i;
      
      arraySize = scnr.nextInt();
      
      int array[] = new int[arraySize];
      
      for (i = 0; i < arraySize; ++i) {
         array[i] = scnr.nextInt();
      }
      
      lowerBound = scnr.nextInt();
      upperBound = scnr.nextInt();
      
      for (i = 0; i < arraySize; ++i) {
         if (array[i] >= lowerBound && array[i] <= upperBound) {
            System.out.print(array[i] + " ");
         }
      }
      
   }
}

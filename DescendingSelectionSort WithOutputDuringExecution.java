import java.util.Scanner;

public class DescendingOrder {
  
   public static void selectionSortDescendTrace(int [] numbers, int numElements) {
      int i;
      int j;
      int indexLargest;
      int temp;      // Temporary variable for swap
      int k;

      for (i = 0; i < numbers.length - 1; ++i) {

         // Find index ofLargest remaining element
         indexLargest = i;
         for (j = i + 1; j < numbers.length; ++j) {

            if (numbers[j] > numbers[indexLargest]) {
               indexLargest = j;
            }
         }

         // Swap numbers[i] and numbers[indexLargest]
         temp = numbers[i];
         numbers[i] = numbers[indexLargest];
         numbers[indexLargest] = temp;
         
         for (k = 0; k < numElements; ++k) {
            System.out.print(numbers[k] + " ");
            
         }
         System.out.println();
      }
      
  
   }
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int input, i = 0;
      int [] numbers = new int[10];
      int counter = 0;
      
      //takes input
      for (i=0; i < 10; ++i) {
         input = scnr.nextInt();
         
         if (input == -1) {
          break;  
         }
         else {
            numbers[i] = input;
         }
      }
      
      //counts input
      for (i = 0; i < 10 ; ++i) {
         if (numbers[i] > 0 || numbers[i] < 0) {
            ++counter;
         }
      }
      
      //new perfect size array
      
      int[] numbersArray = new int[counter];
      
      for (i = 0; i < counter; ++i) {
         numbersArray[i] = numbers[i];
      }
      
      //send to sort
      
      selectionSortDescendTrace(numbersArray, counter);
      

   }
}


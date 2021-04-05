import java.util.Scanner;

public class LabProgram {

   public static int fibonacci (int n) {
      int i;
      int number;
      
      //creates array for n numbers to store fibonacci numbers
      int[] fibArray = new int[n + 1];
      fibArray[0] = 0;
      fibArray[1] = 1;
      
      //calculates and stores fib number in array
      for (i=2; i < n+1; ++i) {
         fibArray[i] = (fibArray[i-2] + fibArray[i-1]);
      }
      
      //returns n from array
      return fibArray[n];
   }
      
   public static void main(String[] args) {
         
      Scanner scnr = new Scanner(System.in);
      //gets input and sends input to fibonacci if not a negative number, if negative prints -1
      int n = scnr.nextInt();
         if (n < 0) {
         System.out.print(-1);
            }
         else{
         System.out.print(fibonacci(n));
      }
    }
   
   
   
}

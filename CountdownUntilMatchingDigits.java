import java.util.Scanner;

public class LabProgram {

Scanner scnr = new Scanner(System.in);
      
      int num = scnr.nextInt();
      int i;
      
         if ((num > 20) && (num < 98)) {
            while (!(num % 11 == 0)) {
               System.out.print(num + " ");
               --num;
               }
            if (num % 11 == 0) {
               System.out.print(num);}
         }
         
         else {
            System.out.print("Input must be 20-98");
         }
}

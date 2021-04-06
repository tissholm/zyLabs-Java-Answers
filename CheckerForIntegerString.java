import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        String input;
        int i;
        int StringIsDigit = 1;
        
        input = scnr.nextLine();
        
        for (i = 0; i < input.length(); ++i) {
           if (!(Character.isDigit(input.charAt(i)))) {
              System.out.println("no");
              StringIsDigit = 0;
              break; }
              
              else {
               StringIsDigit = 1;
               }
            }
          
         if (StringIsDigit == 1) {
            System.out.println("yes");
         }
   }
}

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        String input;
        String reversed = "";
        String a = "Quit";
        String b = "quit";
        String c = "q";
        int i;
        
        input = scnr.nextLine();
        
        while ((!(input.equals(a)))&&(!(input.equals(b)))&&(!(input.equals(c)))){
           for (i = 0; i < input.length(); ++i) {
              reversed = reversed + input.charAt(input.length() - 1 - i);
           }
           System.out.println(reversed);
           input = scnr.nextLine();
           reversed = "";
        }
   }
}

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      /* Type your code here. */

      Scanner scnr = new Scanner(System.in); //create an instance of scanner 
      String initialPass = scnr.nextLine(); 

      initialPass = initialPass.replace("i", "1"); 
      initialPass = initialPass.replace("a", "@"); 
      initialPass = initialPass.replace("m", "M"); 
      initialPass = initialPass.replace("B", "8"); 
      initialPass = initialPass.replace("s", "$"); 
      initialPass += "!";
      System.out.println(initialPass);

   }
}

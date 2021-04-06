import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
         String inputObject;
         int inputNum; 
       
         inputObject = scnr.next();
         inputNum = scnr.nextInt();
   
       while ((!inputObject.equals("quit")) && !(inputNum == 0)) {
         System.out.println("Eating " + inputNum + " " + inputObject + " a day keeps the doctor away.");
          inputObject = scnr.next();
          inputNum = scnr.nextInt();
      }
      
   }
}

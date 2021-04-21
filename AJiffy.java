import java.util.Scanner;

public class LabProgram {
   
   public static double secondsToJiffies(double userSeconds) {
   
   return userSeconds * 1000.0;
    
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double inputSeconds;
      double jiffies;
      
      inputSeconds = scnr.nextDouble();
      jiffies = secondsToJiffies(inputSeconds);
      
      System.out.printf("%.2f", jiffies);
      
   }
}

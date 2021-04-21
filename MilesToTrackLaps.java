import java.util.Scanner;

public class LabProgram {
   
   public static double MilesToLaps(double userMiles) {
   
   return userMiles / 0.25;
    
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double inputMiles;
      double laps;
      
      inputMiles = scnr.nextDouble();
      laps = MilesToLaps(inputMiles);
      
      System.out.println(laps);
      
   }
}

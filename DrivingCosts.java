import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      double MilesGallon;
      double DollarsMile;
      double TwenMiles;
      double SevtnyMiles;
      double FiveHundMiles;
      
      MilesGallon = scnr.nextDouble();
      DollarsMile = scnr.nextDouble();
      
      TwenMiles = (20/MilesGallon)*DollarsMile;
      SevtnyMiles = (75/MilesGallon)*DollarsMile;
      FiveHundMiles = (500/MilesGallon)*DollarsMile;
      
      System.out.printf("%.2f", TwenMiles);
      System.out.print(" ");
      System.out.printf("%.2f", SevtnyMiles);
      System.out.print(" ");
      System.out.printf("%.2f", FiveHundMiles);
      System.out.println();
      
   }
}

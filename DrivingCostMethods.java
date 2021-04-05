import java.util.Scanner;

public class Main {
   
   public static double DrivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) { 
      
   return ((drivenMiles/milesPerGallon)*dollarsPerGallon);
   
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      double carMilesGallon;
      double carGasDollarsGallon;
      double milesAGallon;
      
      carMilesGallon = scnr.nextDouble();
      carGasDollarsGallon = scnr.nextDouble();
       
      System.out.print(DrivingCost(10, carMilesGallon, carGasDollarsGallon) + " ");
      System.out.print(DrivingCost(50, carMilesGallon, carGasDollarsGallon) + " ");
      System.out.print(DrivingCost(400, carMilesGallon, carGasDollarsGallon));
      
   }
   
   
}

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double frequency; 
      double higherKey;
      double res;
      double freOne;
      double freTwo;
      double freThree;
      double freFour;
      
      frequency = scnr.nextDouble();
      
      
      res = Math.pow(2, (1.0/12.0));
      
      freOne = frequency * Math.pow(res, 1);
      freTwo = frequency * Math.pow(res, 2);
      freThree = frequency * Math.pow(res, 3);
      freFour = frequency * Math.pow(res, 4);
      
      System.out.printf("%.2f", frequency);
      System.out.print(" ");
      System.out.printf("%.2f", freOne);
      System.out.print(" ");
      System.out.printf("%.2f", freTwo);
      System.out.print(" ");
      System.out.printf("%.2f", freThree);
      System.out.print(" ");
      System.out.printf("%.2f", freFour);
      System.out.println();

   }
}

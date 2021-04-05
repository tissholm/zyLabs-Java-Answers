import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      double caffeineMg; 
      double SixHours;
      double TewleveHours;
      double TwentyFourHours;
      
      caffeineMg = scnr.nextDouble(); 
      
      SixHours = caffeineMg/2;
      TewleveHours = SixHours/2;
      TwentyFourHours = TewleveHours/4;
      
      System.out.printf("After 6 hours: %.2f mg\n", SixHours);
     
      System.out.printf("After 12 hours: %.2f mg\n", TewleveHours);
      
      System.out.printf("After 24 hours: %.2f mg\n", TwentyFourHours);
     
      
      
   }
}

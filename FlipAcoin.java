import java.util.Scanner;
import java.util.Random;

public class LabProgram {
   
  public static String headsOrTails(Random rand) {
    String headsOrTailsReturn = "";
    int randVal;
    
    randVal = rand.nextInt(2);
    
    if (randVal == 0) {
       headsOrTailsReturn = "heads";
    }
     if (randVal == 1) {
       headsOrTailsReturn = "tails";
    }
    
    return headsOrTailsReturn;
  }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Unique seed
      int input;
      int i;
      
      input = scnr.nextInt();
      
      for (i=0; i < input; ++i) {
      System.out.println(headsOrTails(rand));
      }

   }
}

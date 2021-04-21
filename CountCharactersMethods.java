import java.util.Scanner;

public class LabProgram {
   
   public static int countCharacters(char userChar, String userString) {
   int i;
   int frequencyCharacter = 0;
   
   for (i = 0; i < userString.length(); ++i ) {
      if (userChar == userString.charAt(i)) {
         ++frequencyCharacter;
      }
   }
   
   return frequencyCharacter;
   
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char character;
      int characterFreq;
      String inputLine;
      
      character = scnr.next().charAt(0);
      inputLine = scnr.nextLine();
      
      characterFreq = countCharacters(character, inputLine);
      
      System.out.println(characterFreq);
      
   }
}

import java.util.Scanner;

public class LabProgram {


Scanner scnr = new Scanner(System.in);
      int numberOfWords;
      String line;
      String character;
      char characterChar;
      int i;
      int j;
      
      numberOfWords = scnr.nextInt();
      
      String[] stringLine = new String[numberOfWords];
      
      for (i = 0; i < numberOfWords; ++i) {
         stringLine[i] = scnr.next();
      }
      
      character = scnr.next();
      characterChar = character.charAt(0);
      
       for (i = 0; i < numberOfWords; ++i) {
          for (j = 0; j < stringLine[i].length(); ++j) {
             if (stringLine[i].charAt(j) == characterChar){
                System.out.println(stringLine[i]); 
                break;
                }
            
        }
     }

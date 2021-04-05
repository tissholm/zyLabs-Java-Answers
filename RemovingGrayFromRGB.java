import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      
      int red;
      int blue;
      int green;
      
      red = scnr.nextInt();
      blue = scnr.nextInt();
      green = scnr.nextInt();
      
      int smallestNumber;
      if (red <= blue && red <= green) {
      smallestNumber = red; }
      else if (blue <= green && blue <= red) {
      smallestNumber = blue;}
      else {
      smallestNumber = green; }
      
      red = red - smallestNumber;
      blue = blue - smallestNumber;
      green = green - smallestNumber;
      
      System.out.println(red + " " + blue + " " + green);
   }
}









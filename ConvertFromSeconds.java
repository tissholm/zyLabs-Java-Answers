import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      int seconds;
      int minutes;
      int hours;
      
      int seconds1;
      
      Scanner scnr = new Scanner(System.in);
      
      seconds1 = scnr.nextInt();
      
      hours = seconds1 / 3600;
      
      minutes = (seconds1 % 3600)/60;
      
      seconds = seconds1 % 60;
      
      
      System.out.println("Hours: " + hours);
      System.out.println("Minutes: " + minutes);
      System.out.println("Seconds: " + seconds);

   }
}

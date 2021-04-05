import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      String firstName;
      String lastName;
      String middleName;
      char firstInital;
      char middleInital;
      
    Scanner scnr = new Scanner (System.in);
    
    firstName = scnr.next();
    middleName = scnr.next();
    
    if (!scnr.hasNext()) {
       lastName = middleName;
       
       firstInital = firstName.charAt(0);
       
       System.out.println(lastName + ", " + firstName + ".");
       }
       
   else {
        lastName = scnr.next();
        
        firstInital = firstName.charAt(0);
        middleInital = middleName.charAt(0);
        
        System.out.println(lastName + ", " + firstInital + "." + middleInital + ".");
        
   }
   }
}


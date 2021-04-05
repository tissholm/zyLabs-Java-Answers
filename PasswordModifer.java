import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        String userPassword;
        String userPasswordStronger = "";
        String exclamationMark;
        
        userPassword = scnr.nextLine();
        
         userPasswordStronger = userPassword.replace('i', '1');
         userPasswordStronger = userPasswordStronger.replace('a', '@');
         userPasswordStronger = userPasswordStronger.replace('m', 'M');
         userPasswordStronger = userPasswordStronger.replace('B', '8');
         userPasswordStronger = userPasswordStronger.replace('s', '$');
         
         exclamationMark = "!";
         
         userPasswordStronger = userPasswordStronger.concat(exclamationMark);

         System.out.println(userPasswordStronger);
          
   }
}

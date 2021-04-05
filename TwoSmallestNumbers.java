  import java.util.Scanner;

public class LabProgram {

  Scanner scnr = new Scanner(System.in);  
      int numElements; 
      int i;
      int smallest;
      int secondSmallest;
      
     numElements = scnr.nextInt();
     int[] userList = new int[numElements]; 
      
      for (i=0; i < userList.length; ++i) {
         userList[i] = scnr.nextInt();
      }
      
      smallest = userList[0];
      secondSmallest = userList[1];
      
      for ( i = 0; i < userList.length; ++i) {
         if (smallest > userList[i]) {
          smallest = userList[i];
            }
         }
         
       for ( i = 0; i < userList.length; ++i) {
         if ((secondSmallest > userList[i])&& (userList[i] != smallest)) {
          secondSmallest = userList[i];
            }
         }
         
         System.out.print(smallest + " " + secondSmallest);
         
    }

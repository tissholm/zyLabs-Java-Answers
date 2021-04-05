import java.util.Scanner;

public class LabProgram {
  Scanner scnr = new Scanner(System.in);
     int i;
     double[] peoplesWeights = new double[5];
     double totalWeight;
     double averageWeight;
     double maxWeight;
    
     //creates array
     for (i = 0; i < peoplesWeights.length; ++i) {
        peoplesWeights[i] = scnr.nextDouble();
     }
     
     //outputs array
       System.out.print("You entered: ");
     for (i = 0; i < peoplesWeights.length; ++i) {
        System.out.print(peoplesWeights[i] + " ");
     }
     
     //linebreak
      System.out.println();
      System.out.println();
      
     //total weight
     totalWeight = 0;
         for (i = 0; i < peoplesWeights.length; ++i) {
            totalWeight = totalWeight + peoplesWeights[i];
     }
            System.out.println("Total Weight: "+ totalWeight);
            
      //average weight
      averageWeight = (totalWeight / 5);
      System.out.println("Average weight: "+ averageWeight);
      
      //max weight
      maxWeight = 0;
      for (i = 0; i < peoplesWeights.length; ++i) {
            if (peoplesWeights[i] > maxWeight) {
               maxWeight = peoplesWeights[i];}
     }
     System.out.print("Max weight: " + maxWeight);
     
     //end program


}

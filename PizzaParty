import java.util.Scanner;

public class LabProgram {

Scanner scnr = new Scanner(System.in);
    int numPizzas;
    int numSlices;
    int numAdults;
    int numChild;
    int totalSlices;
    int slicesAfterAdults;
    int slicesKids;
    int leftOver;
    
    numPizzas = scnr.nextInt();
    numSlices = scnr.nextInt();
    numAdults = scnr.nextInt();
    numChild = scnr.nextInt();
    
    totalSlices = (numSlices * numPizzas);
    slicesAfterAdults = totalSlices - (numAdults * 2);
    slicesKids = (slicesAfterAdults) / numChild;
    leftOver = (totalSlices - numAdults * 2) % numChild;
    
    
    System.out.println("Total slices of pizza: " + totalSlices);
    System.out.println("Total number given to adults: " + (numAdults * 2));
    System.out.println("Slices Available for kids: " + slicesAfterAdults);
    System.out.println("Number of slices kids will get: " + slicesKids);
    System.out.println("Number of slices left over: " + leftOver);
    
    
   }

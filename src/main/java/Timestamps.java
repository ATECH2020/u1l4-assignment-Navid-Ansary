import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

       //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        //Reads ints from user
        System.out.print("Hour 1: ");
        int H1 = scanner.nextInt(); // Hour 1
        
        System.out.print("Minute 1: ");
        int M1 = scanner.nextInt(); // Minute 1
        
        System.out.print("Seconds 1: ");
        int S1 = scanner.nextInt(); // Second 1
        
        System.out.print("\nHour 2: ");
        int H2 = scanner.nextInt(); // Hour 2
        
        System.out.print("Minute 2: ");
        int M2 = scanner.nextInt(); // Minute 2
        
        System.out.print("Seconds 2: ");
        int S2 = scanner.nextInt(); // Second 2

        int HS = 3600; // Seconds in an Hour
        int MS = 60; // Seconds in a Minute

        int DH; // Delta Hour
        int DM; // Delta Minute
        int DS; // Delta Second

        int SDH; // Delta Hour converted to Seconds
        int SDM; // Delta Minute convereted to Seconds

        int total;

        //---your code goes here----
        DH = H2 - H1;
        DM = M2 - M1;
        DS = S2 - S1;

        //All Delta Differences have been calculated

        SDH = DH * HS;
        SDM = DM * MS;

        // All Delta Factors have been calculated

        total = SDH + SDM + DS;

        //Total has been calculated

        System.out.println("\nTotal Seconds = " + total);

        // closing the scanner object
        scanner.close();
    }
}
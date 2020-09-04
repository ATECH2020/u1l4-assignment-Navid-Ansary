import java.util.*;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int sec;
        int hours; 
        int min; 

        //Your code goes here
        sec = scanner.nextInt();
        hours = sec / 3600;
        min = sec /60;
        System.out.println("Hours: " + hours + " ");
        System.out.println("Minutes: " + min + " ");

        // closing the scanner object
        scanner.close();
    }
}
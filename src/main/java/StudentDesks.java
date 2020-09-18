import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        //Reads ints from user
        int C1 = scanner.nextInt(); // Classroom 1
        int C2 = scanner.nextInt(); // Classroom 2
        int C3 = scanner.nextInt(); // Classroom 3
        
        int X = 2; // Divisor because each desk seats 2 students
        
        int R1; // Result classroom 1
        int R2; // Result classromm 2
        int R3; // Result classroom 3
        int total; // Product of all Three classrooms
        
        
        //---your code starts here---
        R1 = (C1 / X) + (C1 % X);
        R2 = (C2 / X) + (C2 % X);
        R3 = (C3 / X) + (C3 % X);
        total = R1 + R2 + R3;
        
        System.out.print(total);
        
        // closing the scanner object
        scanner.close();
    }
}
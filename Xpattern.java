 import java.util.Scanner;

public class Xpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask for the number of rows (should be an odd number for a symmetric X)
        System.out.print("Enter number of rows (odd number): ");
        int n = sc.nextInt();
        
        // Check if the number is odd
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for a symmetric X.");
            return;
        }

        // Loop through each row
        for (int i = 0; i < n; i++) {
            // Loop through each column in the row
            for (int j = 0; j < n; j++) {
                // Place stars on the diagonal positions
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }

        sc.close();
    }
}
 

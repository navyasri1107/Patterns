import java.util.Scanner;

public class Rhombuspattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for the number of rows (height of half of the rhombus)
        System.out.print("Enter number of rows (half of the rhombus height): ");
        int n = sc.nextInt();

        // Print the top half of the rhombus
        for (int i = 1; i <= n; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars in the current row
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }

        // Print the bottom half of the rhombus
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces before the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars in the current row
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }

        sc.close();
    }
}
 

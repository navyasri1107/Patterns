 import java.util.Scanner;

public class Rightpyramidpattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask for the number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Loop to print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        sc.close();
    }
}
 

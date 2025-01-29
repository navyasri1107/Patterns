 import java.util.Scanner;

public class Rectanglepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask for the number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        // Loop to print each row
        for (int i = 0; i < rows; i++) {
            // Loop to print stars in each column of the row
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing one row
            System.out.println();
        }

        sc.close();
    }
}
 

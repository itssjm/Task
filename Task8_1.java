
import java.util.Scanner;


public class Task8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nTask 1: Compare sums of four integers");

        // Prompt the user to enter four integers
        System.out.println("Enter four integer values (a, b, c, d):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // Check if the sum of a and b is greater than the sum of c and d
        if (a + b > c + d) {
            System.out.println("The sum of a and b is greater than the sum of c and d.");
        } else {
            System.out.println("The sum of a and b is not greater than the sum of c and d.");
        }

        scanner.close();
    }
}

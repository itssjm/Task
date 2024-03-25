    import java.util.Scanner;

    public class Task8_6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("\nTask 6: Calculate factorial of a number:");
        System.out.println("Enter a number to find its factorial:");
        int numForFactorial = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numForFactorial; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + numForFactorial + " is " + factorial);
        scanner.close();

        }
    }
    



import java.util.Scanner;

public class Task8_5 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
    System.out.println("\nTask 5: Check if a number is prime or not");
        System.out.println("Enter a number to check if it's prime or Not:");
        int numToCheck = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(numToCheck); i++) {
            if (numToCheck % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && numToCheck > 1) {
            System.out.println(numToCheck + " is a prime number.");
        } else {
            System.out.println(numToCheck + " is not a prime number.");
            scanner.close();
        }
    }
}

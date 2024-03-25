
    import java.util.Scanner;

    public class Task8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nTask 2: Check if a number is even or odd:");

        // Prompt the user to enter an integer
        System.out.println("Enter an Number:");
        int num = scanner.nextInt();

        // Check if the number is even
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is not an even number.");
        }

        scanner.close();
    }
}


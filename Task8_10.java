    import java.util.Scanner;

    public class Task8_10 {
    public static void main(String[] args) {
        System.out.println("\nTask 10: Count number of digits in an integer");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}



    import java.util.Scanner;

    public class Task8_9 {
    public static void main(String[] args) {
        System.out.println("\nTask 9: Check if a person is a senior citizen");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the age of the person: ");
        int age = scanner.nextInt();

        if (age >= 60) {
            System.out.println("This person is a senior citizen.");
        } else {
            System.out.println("This person is not a senior citizen.");
            scanner.close();
        }
    }
}


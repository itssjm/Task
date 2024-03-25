
    import java.util.Scanner;

    public class Task8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nTask 4: Swap two numbers");
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Swapped values: " + num1 + " " + num2);
        scanner.close();
    }
    
}



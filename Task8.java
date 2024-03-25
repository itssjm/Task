  
    import java.util.Scanner;

    public class Task8 {
        public static void main(String[] args) {
            // Task 1
            int a = 5, b = 7, c = 8, d = 3;
            if (a + b > c + d) {
                System.out.println("The sum of a and b is greater than the sum of c and d.");
            }
    
            // Task 2
            int num = 6;
            if (num % 2 == 0) {
                System.out.println(num + " is an even number.");
            }
    
            // Task 3
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
    
            // Task 4
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
    
            int temp = num1;
            num1 = num2;
            num2 = temp;
            System.out.println("Swapped values: " + num1 + " " + num2);
    
            // Task 5
            System.out.print("Enter a number to check if it's prime: ");
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
            }
    
            // Task 6
            System.out.print("Enter a number to find its factorial: ");
            int numForFactorial = scanner.nextInt();
            int factorial = 1;
            for (int i = 1; i <= numForFactorial; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + numForFactorial + " is " + factorial);
    
            // Task 7
            String msg = "Guvi Geek";
            System.out.println("Length of the given string \"" + msg + "\" is " + msg.length());
    
            // Task 8
            for (int i = 0; i < 10; i++) {
                System.out.println("Welcome to Guvi");
            }
    
            // Task 9
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age >= 60) {
                System.out.println("You are a senior citizen.");
            } else {
                System.out.println("You are not a senior citizen.");
            }
    
            // Task 10
            System.out.print("Enter an integer to count its digits: ");
            long numForDigitCount = scanner.nextLong();
            int digitCount = String.valueOf(numForDigitCount).length();
            System.out.println("Number of digits in " + numForDigitCount + " is " + digitCount);
    
            scanner.close();
        }
    }
    



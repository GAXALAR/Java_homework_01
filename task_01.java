import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int triangularNumber = 0;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            triangularNumber += i;
            factorial *= i;
        }

        System.out.println("The " + n + "th triangular number is: " + triangularNumber);
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
} 
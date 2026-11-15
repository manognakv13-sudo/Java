
import java.util.Scanner;

public class Fibonacci {

    public static int fib(int n) {

        // Base condition
        if (n <= 1) {
            return n;
        }

        // Recursive calls
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = fib(n);

        System.out.println("Fibonacci number: " + result);

        sc.close();
    }
}

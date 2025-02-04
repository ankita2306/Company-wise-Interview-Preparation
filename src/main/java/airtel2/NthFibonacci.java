package airtel2;

public class NthFibonacci {
    public static void main(String[] args) {
        int n=6;

        // 0 1 1 2 3 5 8 13
        int fib=fibonacciNumber(n);
        System.out.println(fib);
    }

    public static int fibonacciNumber(int n){
        // Base cases
        if (n == 0) {
            return 0; // Fibonacci(0) = 0
        }
        if (n == 1) {
            return 1; // Fibonacci(1) = 1
        }

        int [] memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }
        // If already calculated, return the stored value
        if (memo[n] != -1) {
            return memo[n];
        }

        // Otherwise, calculate it and store it in the memo array
        memo[n] = fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
        return memo[n];
    }
}

package TCS;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 15;
// 0 1 1 2 3 5
        int ans = fib(n);
        System.out.println(ans);
    }

    private static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n - 2) + fib(n - 1);
    }
}

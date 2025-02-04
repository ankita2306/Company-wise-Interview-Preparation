package TCS;

public class AddDigits {
    public static void main(String[] args) {
        int n = 1358;
        int res = addDigits(n);
        System.out.println(res);
    }

    public static int addDigits(int n) {

        while (n > 9) {
            n = sumOfDigits(n);
        }
        return n;
    }

    private static int sumOfDigits(int n) {
        int x, sum = 0;
        while (n != 0) {
            x = n % 10;
            sum += x;
            n = n / 10;
        }
        return sum;
    }
}

package PayTm;

public class CircularPrime {
    public static void main(String[] args) {
        int n = 1193;
        boolean res = cyclicPermutations(n);
        System.out.println(res);
        System.out.println(isPrime(2));    // true
        System.out.println(isPrime(17));   // true
        System.out.println(isPrime(20));   // false
        System.out.println(isPrime(113));  // true
    }

    private static boolean cyclicPermutations(int n) {

        int size = digitCount(n);

        for (int i = 0; i < size; i++) {
            n = (n % 10) * (int)(Math.pow(10,size-1)) + (n / 10);
            if(isPrime(n))
            {
                return true;
            }
        }
        return false;
    }

    private static int digitCount(int n) {
        int counter = 0;
        while (n != 0) {
            int x = n % 10;
            counter++;
            n = n / 10;
        }
        return counter;
    }

    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <=n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            return true;
        else
            return false;
    }
}

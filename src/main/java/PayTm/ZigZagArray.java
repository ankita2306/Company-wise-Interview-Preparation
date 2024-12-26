package PayTm;

import java.util.Arrays;

public class ZigZagArray {
    public static void main(String[] args) {
        int a[] = {4, 3, 7, 8, 6, 2, 1};
        int n = a.length;

        zigZag(a, n);
        System.out.println(Arrays.toString(a));
    }

    private static void zigZag(int[] a, int n) {
        //arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < …
        //  3 < 7 > 4 < 8 > 2 < 6 >1
        for (int i = 0; i < n; i++) {

        }
    }
}

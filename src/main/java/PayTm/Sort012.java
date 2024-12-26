package PayTm;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int a[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort012(a);
        System.out.println(Arrays.toString(a));

    }

    public static void sort012(int[] a) {
        //Dutch National Flag algorithm
        int n = a.length;
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                swapValue(a, low, mid);
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                swapValue(a, mid, high);
                high--;
            }
        }
    }

    private static void swapValue(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}

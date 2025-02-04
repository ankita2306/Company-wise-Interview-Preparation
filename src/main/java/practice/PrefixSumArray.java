package practice;

import java.util.Arrays;

public class PrefixSumArray {
    public static void main(String[] args) {
        int a[] = {10, 20, 10, 5, 15};
        int prefixSum[] = prefixSum(a);
        System.out.println(Arrays.toString(prefixSum));
    }

    private static int[] prefixSum(int[] a) {
        int n = a.length;
        int res[] = new int[n];
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = s + a[i];
            res[i]=s;
        }
        return res;
    }
}

package airtel2;

import java.util.Arrays;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int a[] = {16, 17, 4, 3, 5, 2};

        int res[] = leadersInArray(a);
        System.out.println(Arrays.toString(res));
    }

    private static int[] leadersInArray(int[] a) {
        int n = a.length;
        int res[] = new int[n];

        res[0] = a[n - 1];
        for (int i = 0; i < n - 1; i++) {

        }


        return res;
    }
}

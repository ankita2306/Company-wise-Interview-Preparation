package airtel2;

import java.util.Arrays;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        //KDANE's Algorithm

        int a[] = {-2, -5, 6, -2, -3, 1, 5};
        int n = a.length;

        int res = maximumSumSubArray(a);
        System.out.println(res);
    }

    private static int maximumSumSubArray(int a[]) {
        int maxSoFar = a[0];
        int currentMax = a[0];

        for (int i = 0; i < a.length; i++) {
            currentMax = Math.max(a[i], a[i] + currentMax);

            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }
}

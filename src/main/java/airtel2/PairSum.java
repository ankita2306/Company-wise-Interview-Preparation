package airtel2;

import java.util.ArrayList;
import java.util.List;

public class PairSum {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int targetSum = 5; // Define the target sum

        // Call the pairSum method
        List<int[]> pairs = pairSum(a, targetSum);
        for (int[] pair : pairs) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }
    }

    public static List<int[]> pairSum(int[] a, int target) {
        List<int[]> result = new ArrayList<>();

        int n = a.length;

        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (a[i] + a[j] == target) {
                result.add(new int[]{a[i], a[j]});
                i++;
                j--;
            }
            else if (a[i] + a[j] > target)
                j--;
            else
                i++;
        }

        return result;
    }
}

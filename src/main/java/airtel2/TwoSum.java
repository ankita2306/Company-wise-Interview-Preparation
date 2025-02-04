package airtel2;

import java.util.ArrayList;

public class TwoSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int target = 6; // Example target
        int n = arr.size();

        ArrayList<int[]> pairs = twoSum(arr, target, n);
        // Print the result
        if (pairs.isEmpty()) {
            System.out.println("-1 -1");
        } else {
            for (int[] pair : pairs) {
                System.out.println(pair[0] + " " + pair[1]);
            }
        }
    }

    public static ArrayList<int[]> twoSum(ArrayList<Integer> a, int target, int n) {
        ArrayList<int[]> result = new ArrayList<>();

        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (a.get(i) + a.get(j) == target) {
                result.add(new int[]{a.get(i), a.get(j)});
                i++;
                j--;
            }
            else if (a.get(i) +a.get(j) > target)
                j--;
            else
                i++;
        }
        return result;
    }
}

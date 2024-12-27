package itcInfotech;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {
    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 0, 1, 3, 2}; // Input array
        int n = arr.length;
        int maxLast = arr[n - 1]; // Initialize the last element as max

        List<Integer> leaders = new ArrayList<>();
        leaders.add(maxLast); // Add the last element as it is always a leader

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxLast) {
                maxLast = arr[i];
                leaders.add(0, maxLast); // Add at the start to maintain order
            }
        }
        System.out.println("Leaders in the array: " + leaders);
    }
}

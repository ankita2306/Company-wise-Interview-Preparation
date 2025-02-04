package mostAsked.arrayAndString;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int a[] = {3, 4, 2, 7, 1, 9};
        int target = 6;

        int indexes[] = twoPointer(a, target);
        System.out.println(Arrays.toString(indexes));
    }

    private static int[] twoPointer(int[] a, int target) {
        Arrays.sort(a);
        int i = 0;
        int j = a.length - 1;

        int index[] = new int[2];
        while (i < j) {
            if (a[i] + a[j] == target) {
                index[0] = i;
                index[1] = j;
                return index;
            } else if (a[i] + a[j] > target) {
                j--;
            } else
                i++;
        }
        return new int[]{-1};
    }
}

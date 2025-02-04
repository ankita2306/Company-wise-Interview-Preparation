package airtel2;

import java.util.Arrays;

public class FirstandLastPositionofElementInSortedArray {
    public static void main(String[] args) {
        int a[] = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int res[] = searchRange(a, target);
        System.out.println(Arrays.toString(res));

    }

    public static int[] searchRange(int[] a, int target) {
        int firstIndex = firstOccurence(a, target);
        int lastIndex = lastOccurence(a, target);
        return new int[]{firstIndex, lastIndex};
    }

    private static int lastOccurence(int[] a, int target) {
        int start = 0, end = a.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (a[mid] == target) {
                index = mid;
                start = mid + 1;
            } else if (a[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return index;
    }

    private static int firstOccurence(int[] a, int target) {

        int start = 0, end = a.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (a[mid] == target) {
                index = mid;
                end = mid - 1;
            } else if (a[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return index;
    }
}

package airtel;

public class FindIndexInRotatedSoredArray {
    public static void main(String[] args) {
        int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 7;
        int res = searchRotatedArray(a, target);
        System.out.println(res);
    }

    private static int searchRotatedArray(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == target)
                return mid;

            if (a[left] <= a[mid])
            {                                                //left half sorted
                if (target >= a[left] && target < a[mid])
                    right = mid - 1;    //target in left half
                else
                    left = mid + 1;      //target in right half
            }
            else                     //right half SORTED
            {
                if (target <= a[right] && target > a[mid])
                    left = mid + 1;            // Target in right half
                else
                    right = mid - 1;  //left half
            }
        }
        return -1;
    }
}

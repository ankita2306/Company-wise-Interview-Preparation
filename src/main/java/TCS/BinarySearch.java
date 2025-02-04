package TCS;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {-1, 0, 3, 5, 9, 12}, target = 9;

        int ans = search(a, target);
        System.out.println(ans);
    }

    public static int search(int[] a, int target) {

        int start = 0, end = a.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (a[mid] == target)
                return mid;
            else if (a[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}

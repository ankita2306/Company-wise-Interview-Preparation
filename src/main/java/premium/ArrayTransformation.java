package premium;

import java.util.ArrayList;
import java.util.List;

public class ArrayTransformation {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 4, 3, 5};

        List<Integer> ans = transformArray(arr);
        System.out.println(ans);

    }

    public static List<Integer> transformArray(int[] a) {
        List<Integer> list = new ArrayList<>();
        list.add(a[0]);
        int n=a.length;
            for (int j = 1; j < n-1; j++) {
                if (a[j - 1] >= a[j] && a[j + 1] >= a[j]) {
                    a[j] = a[j] + 1;
                    list.add(a[j]);
                } else if (a[j - 1] <= a[j] && a[j + 1] <= a[j]) {
                    a[j] = a[j] - 1;
                    list.add(a[j]);
                }
                else if(a[j - 1] == a[j] && a[j + 1] == a[j])
                    break;
            }
        list.add(a[n-1]);
        return list;
    }
}

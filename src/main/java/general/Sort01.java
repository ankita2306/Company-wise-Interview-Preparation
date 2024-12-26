package general;

import java.util.Arrays;

public class Sort01 {
    public static void main(String[] args) {
        int a[] = {0, 1, 1, 0, 1, 1, 0, 0, 0, 1};
        sort012(a);
        System.out.println(Arrays.toString(a));

    }

    public static void sort012(int[] a) {
        int n=a.length;

        int low=0;
        int high=n-1;

        while (low<high)
        {
            if(a[low]==1)
            {
                if(a[high]!=1)
                {
                    //swap
                    int temp=a[low];
                    a[low]=a[high];
                    a[high]=temp;
                }
                else
                    high--;
            }
            else
                low++;
        }
    }
}

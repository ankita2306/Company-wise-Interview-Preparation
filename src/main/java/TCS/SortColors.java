package TCS;

public class SortColors {
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        int n=arr.length;
        sortColors(arr);
    }

    public static void sortColors(int[] a) {

        for (int i = 0; i < a.length-1; i++) {
            if(a[i]>=a[i+1])
            {
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

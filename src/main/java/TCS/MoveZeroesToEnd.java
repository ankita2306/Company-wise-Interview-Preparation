package TCS;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int a[] = {0, 1, 0, 3, 12};
        moveZeroes(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void moveZeroes(int[] a) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] != 0) {
                a[c] = a[i];

                c++;
            }
        }
        while (c < a.length) {
            a[c] = 0;
            c++;
        }
    }
}

package PayTm;

public class PermuteInOrder {
    public static void main(String[] args) {
        int A[] ={11, 32, 3, 42}, P[] = {2, 3, 0, 1};
        int n = A.length;

        permute(A, P, n);
    }

    private static void permute(int[] a, int[] p, int n) {
        // Temporary array to store the permuted result
        int[] temp = new int[n];

        // Rearrange elements in `a` based on `p`
        for (int i = 0; i < n; i++) {
            temp[i] = a[p[i]];
        }

        // Copy the permuted values back into `a`
        for (int i = 0; i < n; i++) {
            a[i] = temp[i];
        }

        // Print the permuted array
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}

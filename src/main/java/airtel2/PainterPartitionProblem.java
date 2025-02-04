package airtel2;
//////////////////////////////////////////////////////////////////////////////////////////////
public class PainterPartitionProblem {
    // Function to check if it is possible to paint all boards in 'maxTime' time
    public static boolean isPossible(int[] arr, int n, int k, int maxTime) {
       int painterCount = 1; // start with the first painter
        int currentTime = 0;  // time taken by current painter

        for (int i = 0; i < n; i++) {
            // If adding the current board exceeds the max time, use a new painter
            if (currentTime + arr[i] > maxTime) {
                painterCount++;
                currentTime = arr[i];  // Start new painter with the current board
                // If more than 'k' painters are needed, return false
                if (painterCount > k) {
                    return false;
                }
            } else {
                currentTime += arr[i];  // Otherwise, add to the current painter's time
            }
        }
        return true;
    }

    // Function to find the minimum time required to paint all boards
    public static int minTimeToPaintBoards(int[] arr, int n, int k) {
        // Find the maximum length of a single board and the sum of all boards
        int maxBoardLength = 0;
        int totalLength = 0;

        for (int i = 0; i < n; i++) {
            maxBoardLength = Math.max(maxBoardLength, arr[i]);
            totalLength += arr[i];
        }

        int low = maxBoardLength;
        int high = totalLength;
        int result = high;


        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(isPossible(arr,n,k,mid))
            {
                result=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        int k = 2;
        int n = arr.length;
        System.out.println("Minimum time to paint all boards: " + minTimeToPaintBoards(arr, n, k));
    }
}

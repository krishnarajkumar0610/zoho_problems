public class MaxSumSubArrWithK {
    public static int maxSumSubarray(int[] arr, int k) {
        if (arr.length < k) {
            return -1; // Edge case: If k is greater than the array size
        }

        int maxSum = 0, windowSum = 0;

        // Compute the sum of the first k elements
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 3;
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSumSubarray(arr, k));
    }
}

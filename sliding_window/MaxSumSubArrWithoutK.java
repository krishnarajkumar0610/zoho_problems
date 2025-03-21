package zoho_problems.sliding_window;

public class MaxSumSubArrWithoutK {
    public static void main(String[] args) {
        int[] arr = { 5, 4, -1, 7, 8 };
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            if (maxValue < arr[i]) { // If arr[i] is greater than maxValue, update maxValue
                maxValue = arr[i];
            }
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] < 0) {
                sum = 0;
            } else {
                sum += arr[i];
                if (sum > maxValue) {
                    maxValue = sum;
                }
            }
        }
        System.out.println(maxValue);
    }
}
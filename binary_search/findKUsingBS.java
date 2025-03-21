package binary_search;

public class findKUsingBS {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11 };
        int target = 7;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("Target found at index:" + mid);
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}

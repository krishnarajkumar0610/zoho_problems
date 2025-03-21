package two_sum;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 2,0, 1, 0 };
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortColors(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
}
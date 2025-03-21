package zoho_problems.two_sum;

import java.util.Arrays;

public class MoveZerosAtEnd {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 0, 1, 0, 3, 0, 5, 6, 0, 7, 8, 0, 9 };
        int start = 0;
        int end = 0;
        while (end < arr.length) {
            if (arr[end] != 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
            }
            end++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

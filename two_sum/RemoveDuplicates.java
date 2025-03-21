package two_sum;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5 };
        int start = 0;
        int end = 1;

        while (end < arr.length) {
            if (arr[start] != arr[end]) {
                arr[++start] = arr[end]; // Move unique elements forward
            }
            end++;
        }
        start += 1;
        while (start < arr.length) {
            arr[start++] = 0;
        }
        System.out.println(start);
        System.out.println(Arrays.toString((arr)));
    }
}

package two_sum;

import java.util.Arrays;

public class MergeSortedArr {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 2, 6 };
        int[] mergedArr = new int[arr1.length + arr2.length];
        int index = 0, indexOne = 0, indexTwo = 0;

        while (indexOne < arr1.length || indexTwo < arr2.length) {
            int nextValue;

            if (indexOne < arr1.length && (indexTwo >= arr2.length || arr1[indexOne] < arr2[indexTwo])) {
                nextValue = arr1[indexOne++];
            } else {
                nextValue = arr2[indexTwo++];
            }
            if (index == 0 || mergedArr[index - 1] != nextValue) {
                mergedArr[index++] = nextValue;
            }
        }
        System.out.println(Arrays.toString(mergedArr));

    }
}

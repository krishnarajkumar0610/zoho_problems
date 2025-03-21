package prefix_suffix;

import java.util.Arrays;

public class Suffix {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        System.out.println(Arrays.toString(findSuffix(arr)));
    }

    static int[] findSuffix(int[] arr) {
        if (arr == null)
            return new int[] { -1 };
        if (arr.length == 1)
            return new int[] { arr[0] };
        int[] suffixArr = new int[arr.length];
        suffixArr[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            suffixArr[i] = arr[i] + suffixArr[i + 1];
        }
        return suffixArr;
    }
}

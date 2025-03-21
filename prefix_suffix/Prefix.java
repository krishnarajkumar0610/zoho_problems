package prefix_suffix;

import java.util.Arrays;

public class Prefix {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        System.out.println(Arrays.toString(findPrefix(arr)));
    }

    static int[] findPrefix(int[] arr) {
        if (arr == null)
            return new int[] { -1 };
        if (arr.length == 1)
            return new int[] { arr[0] };
        int[] prefixArray = new int[arr.length];
        prefixArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];
        }
        return prefixArray;
    }
}

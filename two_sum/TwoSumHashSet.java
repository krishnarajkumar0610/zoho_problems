package two_sum;

import java.util.*;

public class TwoSumHashSet {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 4, 3, 5, 1 };
        int target = 6;
        System.out.println(findTwoSumPairs(arr, target));
    }

    public static List<List<Integer>> findTwoSumPairs(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                result.add(Arrays.asList(complement, num));
            }
            seen.add(num);
        }
        return result;
    }
}

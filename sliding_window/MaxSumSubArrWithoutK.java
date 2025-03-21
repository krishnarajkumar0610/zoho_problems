public class MaxSumSubArrWithoutK {
    public static void main(String[] args) {
        int[] arr = { 5, 4, -1, 7, 8 };
        int currentSum = Integer.MIN_VALUE;
        for (int num : arr) {
            int result = currentSum + num;
            if (result < num)
                currentSum = num;
            else
                currentSum = result;
        }
        System.out.println(currentSum);
    }
}
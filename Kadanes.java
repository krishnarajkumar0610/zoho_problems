class Kadanes {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
        System.out.println(findMaximumSubArr(arr));
    }

    static int findMaximumSubArr(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        if (arr.length == 1)
            return arr[0];
        int maxValue = arr[0];
        int total = 0;
        for (int num : arr) {
            total += num;
            if (maxValue < total) {
                maxValue = total;
            }
            if (total < 0) {
                total = 0;
            }
        }
        return maxValue;
    }
}

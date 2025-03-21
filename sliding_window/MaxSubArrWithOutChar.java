class MaxSubArrWithoutRepeatingChars {
    public static void main(String[] args) {
        String str = "pwwkew";
        int left = 0;
        int right = 0;
        int[] set = new int[26];
        int maxLength = 0;
        while (right < str.length()) {
            int index = str.charAt(right) - 'a';
            set[index]++;
            while (set[index] > 1) {
                set[str.charAt(left) - 'a']--;
                left++;
            }
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
            }
            right++;
        }
        System.out.println(maxLength);
    }
}

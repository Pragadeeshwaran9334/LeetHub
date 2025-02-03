class Solution {
    public int longestOnes(int[] arr, int k) {
        int left = 0; // Left pointer of the window
        int maxLen = 0; // Maximum length of the subarray
        int zeroCount = 0; // Count of zeros in the current window

        for (int right = 0; right < arr.length; right++) {
            // If the current element is 0, increment the zero count
            if (arr[right] == 0) {
                zeroCount++;
            }

            // If zero count exceeds k, move the left pointer to the right
            while (zeroCount > k) {
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Update the maximum length of the window
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
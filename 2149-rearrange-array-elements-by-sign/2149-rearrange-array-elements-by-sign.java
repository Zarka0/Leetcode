class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int j = 0, k = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                neg[j++] = nums[i];
            } else {
                pos[k++] = nums[i];
            }
        }

        int[] res = new int[n];
        j = 0;
        k = 0;
        for (int i = 0; i < n; i += 2) {
            res[i] = pos[k++];
            res[i + 1] = neg[j++];
        }

        return res;
    }
}

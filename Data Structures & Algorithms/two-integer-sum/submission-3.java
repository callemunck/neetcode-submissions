class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int x = nums[i];
                int y = nums[j];
                if (x + y == target) {
                    ans = new int[] { i, j };
                    break;
                }
            }
        }
        return ans;
    }
}
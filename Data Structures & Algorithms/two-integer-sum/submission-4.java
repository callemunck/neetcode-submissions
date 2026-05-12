class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = null;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int y = target - nums[i];
            if (map.get(y) != null) {
                ans = new int[] { map.get(y), i };
                break;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
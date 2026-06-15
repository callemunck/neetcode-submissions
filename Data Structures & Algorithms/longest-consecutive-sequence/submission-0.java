class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet();
        HashSet<Integer> starters = new HashSet();  
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                starters.add(num);
            }
        }
        int maxLen = 0;
        for (int start : starters) {
            int num = start;
            int len = 1;
            while (set.contains(++num)) {
                len++;
            }
            if (len > maxLen) {
                maxLen = len;
            }
        }
        return maxLen;
    }
}

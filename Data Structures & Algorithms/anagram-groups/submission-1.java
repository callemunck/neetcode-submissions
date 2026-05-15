class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String str : strs) {
            int[] count = new int[26];
            for (int j = 0; j < str.length(); j++) {
                count[str.charAt(j) - 'a']++;
            }
            res.putIfAbsent(Arrays.toString(count), new ArrayList<>());
            res.get(Arrays.toString(count)).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
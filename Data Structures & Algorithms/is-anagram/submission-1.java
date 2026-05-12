class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        System.out.println(Arrays.toString(sArray) + " - " + Arrays.toString(tArray));
        return Arrays.equals(sArray, tArray);
    }
}

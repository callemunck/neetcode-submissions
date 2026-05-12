class Solution {
    public static boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        System.out.println(Arrays.toString(sArray) + " - " + Arrays.toString(tArray));
        return Arrays.equals(sArray, tArray);
    }
}

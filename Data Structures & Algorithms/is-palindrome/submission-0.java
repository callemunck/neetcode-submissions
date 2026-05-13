class Solution {
    public static boolean isPalindrome(String s) {
            String newS = s.replaceAll("[^a-zA-Z0-9]",  "").toLowerCase();
            System.out.println(newS);
            for (int i = 0; i < newS.length() / 2; i++) {
                if (newS.charAt(i) != newS.charAt(newS.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
}

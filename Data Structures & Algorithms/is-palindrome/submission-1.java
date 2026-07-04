class Solution {
    public boolean isPalindrome(String s) {
        String trimedS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < trimedS.length() / 2; i++) {
            if (trimedS.charAt(i) != trimedS.charAt(trimedS.length() - i - 1)) return false;
        }
        return true;
    }
}

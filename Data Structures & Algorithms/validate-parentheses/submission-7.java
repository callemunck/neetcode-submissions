class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        Set<Character> closing = new HashSet<>(Arrays.asList(')', '}', ']'));
        for (char c : s.toCharArray()) {
            if (closing.contains(c)) {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            } else {
                switch (c) {
                    case '(':
                        stack.push(')');
                        break;
                    case '{':
                        stack.push('}');
                        break;
                    case '[':
                        stack.push(']');
                }
            }
        }
        return stack.isEmpty();
    }
}

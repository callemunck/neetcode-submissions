class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < tokens.length; i++) {            
        if (tokens[i].equals("+") ||
            tokens[i].equals("-") ||
            tokens[i].equals("*") ||
            tokens[i].equals("/")) {

                int right = stack.pop();
                int left = stack.pop();
                switch(tokens[i]) {
                    case "+": 
                        left = left + right;
                        break;
                    case "-":
                        left = left - right;
                        break;
                    case "*":
                        left = left * right;
                        break;
                    case "/":
                        left = left / right;
                }
                stack.push(left);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();    
        for (String t : tokens) {
            // Check if token is an operator
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                // Pop operands once for all operators (Order: b then a)
                int b = stack.pop();
                int a = stack.pop();
                
                switch (t) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            } else {
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
}

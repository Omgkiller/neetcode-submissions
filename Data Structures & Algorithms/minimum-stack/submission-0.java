class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        s.push(val);
        int curMin;
        if (min.isEmpty()){
            curMin = val;
        }
        else {
            curMin = Math.min(min.peek(), val);
        }
        min.push(curMin);
    }
    
    public void pop() {
        s.pop();
        min.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

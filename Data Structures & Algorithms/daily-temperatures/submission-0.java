class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int [] result = new int[temperatures.length];
        for (int i=0; i<temperatures.length; i++){
            int temp = temperatures[i];
            while (!stack.isEmpty() && temperatures[stack.peek()] < temp){
                int index = stack.pop();
                int diff = i - index;
                result[index] = diff;
            }
            stack.push(i);
        }
        return result;
    }
}

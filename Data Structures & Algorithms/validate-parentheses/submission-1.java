class Solution {
    Map<Character, Character> branketMap = Map.of(
        '(', ')',
        '{', '}',
        '[', ']'
    );
    public boolean isValid(String s) {
          Stack<Character> stack = new Stack<>();
          for (char c : s.toCharArray()){
            if (branketMap.containsKey(c)){
                stack.push(c);
            }
            else {
                if (stack.isEmpty()){
                    return false;
                }
                char b = branketMap.get(stack.pop());
                if (b != c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

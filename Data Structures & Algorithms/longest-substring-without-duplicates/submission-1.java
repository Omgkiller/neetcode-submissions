class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        while (j < s.length()){
            //System.out.println(String.format("i:%d j:%d set:%s", i, j, set));
            while (i < j && set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            j++;
            maxLength = Math.max(j-i, maxLength);
        }
        return maxLength;
    }
}

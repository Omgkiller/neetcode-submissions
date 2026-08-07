class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        int longest = 0;
        for (int num : set){
            if (!set.contains(num - 1)){
                int i = num;
                int length = 0;
                while (set.contains(i)){
                    i++;
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}

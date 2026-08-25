class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>((a, b) -> b - a);
        int i = 0;
        List<Integer> result = new ArrayList<>();
        for (int j = 0; j<nums.length; j++){
            p.add(nums[j]);
            if (j-i+1 > k){
                p.remove(nums[i]);
                i++;
            }
            if (p.size() == k){
                result.add(p.peek());
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

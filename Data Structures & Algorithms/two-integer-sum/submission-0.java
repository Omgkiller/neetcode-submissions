class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i<nums.length; i++){
            int want = target-nums[i];
            if (map.containsKey(want)){
               int index = map.get(want);
               result.add(index);
               result.add(i); 
            }
            map.put(nums[i], i);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

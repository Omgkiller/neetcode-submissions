class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums){
            if (freqMap.containsKey(n)){
                var freq = freqMap.get(n);
                freq++;
                freqMap.put(n, freq);
            }
            else {
                freqMap.put(n, 1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(b.getValue(), a.getValue())
        );
        for (var freq: freqMap.entrySet()){
            minHeap.add(freq);
        }
        int [] result = new int[k];
        for (int i = 0; i<k; i++){
            result[i] = minHeap.poll().getKey();
        }
        return result;
    }
}

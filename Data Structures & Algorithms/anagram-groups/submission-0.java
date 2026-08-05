class Solution {
    private record ArrayKey(int[] arr){
       @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            return Arrays.equals(this.arr, ((ArrayKey) o).arr);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(this.arr);
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<ArrayKey, List<String>> result = new HashMap<>();
        for (String str : strs){
            var arrayKey = buildArrayKey(str);
            if (result.containsKey(arrayKey)){
                result.get(arrayKey).add(str);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(str);
                result.put(arrayKey, list);
            }
        }
        return new ArrayList<>(result.values());        
    }

    private ArrayKey buildArrayKey(String str){
        int [] arr = new int[26];
        for (char c : str.toCharArray()){
            arr[c-'a']++;
        }
        return new ArrayKey(arr);
    }
}

class Solution {
    public int characterReplacement(String s, int k) {
        int[] unique = new int[26];
        int i = 0;
        int j = 0;
        int longest = 0;
        int maxFreq = 0;
        while (j < s.length()){
            int r = s.charAt(j) - 'A';
            maxFreq = Math.max(maxFreq, ++unique[r]);
            j++;
            while (j-i -maxFreq > k){
                maxFreq = Math.max(maxFreq, --unique[s.charAt(i)-'A']);
                i++;
            }
            longest = Math.max(longest, j-i);
        }
        return longest;
    }

    private int getMostFrequent(int[] unique){
        int result = 0;
        for (int i = 0; i<26; i++){
            result = Math.max(result, unique[i]);
        }
        return result;
    }
}

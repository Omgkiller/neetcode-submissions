class Solution {
    public int characterReplacement(String s, int k) {
        int[] unique = new int[26];
        int i = 0;
        int j = 0;
        int longest = 0;
        while (j < s.length()){
            int r = s.charAt(j) - 'A';
            unique[r]++;
            j++;
            int mostFrequent = getMostFrequent(unique);
            while (j-i -mostFrequent > k){
                unique[s.charAt(i)-'A']--;
                mostFrequent = getMostFrequent(unique);
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

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] wordMap = new int[26];
        for (char c : s.toCharArray()){
            wordMap[c-'a']++;
        }
        for (char c : t.toCharArray()){
            wordMap[c-'a']--;
        }
        for (int i : wordMap){
            if (i !=0){
                return false;
            }
        }
        return true;
    }
}

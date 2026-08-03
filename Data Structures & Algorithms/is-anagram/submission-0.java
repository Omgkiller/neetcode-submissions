class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] bucket = new int[26];
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int l = c - 'a';
            bucket[l]++;
        }
        for (int j=0; j<t.length(); j++){
            char c = t.charAt(j);
            int l = c - 'a';
            bucket[l]--;
        }

        for (int count : bucket){
            if (count != 0){
                return false;
            }
        }
        return true;
    }
}

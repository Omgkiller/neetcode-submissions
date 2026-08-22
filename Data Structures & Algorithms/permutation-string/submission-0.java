class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] map = new int[26];
        for (char c : s1.toCharArray()){
            map[c-'a'] +=1;
        }
        for (int j=0; j<s2.length(); j++){
            //System.out.println(Arrays.toString(map));
            char c = s2.charAt(j);
            //System.out.println("add:" + c);
            map[c-'a']-=1;
            if (j - s1.length() >= 0){
                char left = s2.charAt(j-s1.length());
               // System.out.println("remove:" + left);
                map[left-'a']+=1;
            }
            if (allZero(map)){
                return true;
            }
        }
        return false;
    }

    private boolean allZero(int[] map){
        for (int i = 0; i<26; i++){
            if (map[i] != 0){
                return false;
            }
        }
        return true;
    }
}

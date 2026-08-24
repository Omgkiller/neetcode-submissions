class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> tMap = new HashMap();
        int required = 0;
        for (char c : t.toCharArray()){
            if (tMap.containsKey(c)){
                tMap.put(c, tMap.get(c)+1);
            }
            else {
                tMap.put(c, 1);
                required++;
            }
        }
        int match = 0;
        int i = 0;
        int shortest = s.length()+1;
        int bestStart = 0;
        Map<Character, Integer> sMap = new HashMap<>();
        for (int j = 0; j<s.length(); j++){
            char c = s.charAt(j);
            sMap.putIfAbsent(c, 0);
            sMap.put(c, sMap.get(c)+1);
            if (tMap.containsKey(c) && tMap.get(c).equals(sMap.get(c))){
                match++;
            }
            while (match == required && i<=j){
                if (j-i+1 < shortest){
                    bestStart = i;
                    shortest = j-i+1;
                }
                char l = s.charAt(i);
                sMap.put(l, sMap.get(l)-1);
                if (tMap.containsKey(l) && tMap.get(l) > sMap.get(l).intValue()){
                    match--;
                }
                i++;
            }
        }
        return  s.length() + 1 == shortest ? "" : s.substring(bestStart, bestStart + shortest);
    }
}

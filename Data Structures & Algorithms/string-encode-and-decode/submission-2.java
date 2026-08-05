class Solution {
    private char end = '|';
    public String encode(List<String> strs) {
        StringBuilder strBuilder = new StringBuilder();
        for (String s : strs){
            strBuilder.append(s.length());
            strBuilder.append(end);
            strBuilder.append(s);
        }
        System.out.println(strBuilder.toString());
        return strBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()){
            int j = i;
            while (str.charAt(j) != end){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            result.add(str.substring(j + 1, j + 1 + len));
            i = j + 1 + len;
        }
        return result;
    }
}

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
        int wordLength = 0;
        boolean newWord = false;
        StringBuilder b = new StringBuilder();
        for (int i = 0; i<str.length(); i++){
            if (newWord){
                if (wordLength > 0){
                    b.append(str.charAt(i));
                    wordLength--;
                }
                if (wordLength == 0){
                    newWord = false;
                    result.add(b.toString());
                }
            }
            else {
                if (str.charAt(i) == end) {
                    // case when 0 wordLength we add emptyString directly and continue to read wordLength
                    if (wordLength == 0){
                        result.add("");
                    }
                    else {
                        newWord = true;
                    }
                }
                else {
                    wordLength = wordLength * 10 + str.charAt(i) - '0';
                    b = new StringBuilder();
                }
            }
        }
        return result;

    }
}

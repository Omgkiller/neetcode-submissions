class Solution {
    private void initSet(Set<Character>[] set){
        for (int i =0; i<set.length; i++){
            set[i] = new HashSet<>();
        }
    }
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rowSets = new Set[9];
        initSet(rowSets);
        Set<Character>[] columnSet = new Set[9];
        initSet(columnSet);
        Set<Character>[] squareSet = new Set[9];
        initSet(squareSet);
        for (int i = 0; i<board.length; i++){
            for (int j=0; j<board[0].length; j++){
                var cur = board[i][j];
                if (cur == '.'){
                    continue;
                }
                if (!rowSets[i].add(cur)){
                    return false;
                }
                if (!columnSet[j].add(cur)){
                    return false;
                }
                var sqIndex = (i/3)*3 + (j/3);
                if (!squareSet[sqIndex].add(cur)){
                    return false;
                }
            }
        }
        return true;
    }
}

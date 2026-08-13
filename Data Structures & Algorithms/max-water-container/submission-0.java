class Solution {
    public int maxArea(int[] heights) {
        // area = min(height_i, height_j) * (j-i) where j > i
        // maxmize area
        // greedily move the pointer with the smaller height
        int i = 0;
        int j = heights.length-1;
        int result = 0;
        while (i < j){
            int area = Math.min(heights[i], heights[j]) * (j-i);
            if (area > result){
                result = area;
            }
            if (heights[i] > heights[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return result;
        
    }
}

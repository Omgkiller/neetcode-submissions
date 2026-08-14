class Solution {
    public int trap(int[] height) {
        //water x = min(leftMax,rightMax) - height_x
        int [] leftMaxs = new int[height.length];
        int [] rightMaxs = new int[height.length];
        int leftMax = 0;
        for (int i = 0; i<height.length; i++){
            leftMaxs[i] = leftMax;
            leftMax = Math.max(leftMax, height[i]);
        }
        int rightMax = 0;
        for (int j = height.length-1; j>0; j--){
            rightMaxs[j] = rightMax;
            rightMax = Math.max(rightMax, height[j]);
        }
        int result = 0;
        for (int i = 1; i<height.length-1; i++){
            result += Math.max(Math.min(leftMaxs[i], rightMaxs[i]) - height[i],0);
        }
        return result;
    }
}

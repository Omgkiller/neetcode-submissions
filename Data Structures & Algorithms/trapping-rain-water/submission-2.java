class Solution {
    public int trap(int[] height) {
        int leftMax = 0;
        int rightMax = 0;
        int left = 0;
        int right = height.length-1;
        int result = 0;
        while (left < right) {
            //System.out.println(String.format("l:%d r:%d lmax:%d rmax:%d result:%d", left, right, leftMax, rightMax, result));
            if (height[left] > height[right]){
                if (height[right] > rightMax){
                    rightMax = height[right];
                }else{
                    result += rightMax - height[right];
                }
                right--;
            }
            else {
                if (height[left] > leftMax){
                    leftMax = height[left];
                }
                else{
                    result += leftMax - height[left];
                }
                left++;
            }
        }
        return result;
    }
}

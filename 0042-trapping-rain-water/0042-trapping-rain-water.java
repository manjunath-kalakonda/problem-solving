class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftmax=0;
        int maxright=0;
        int water=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left] >= leftmax)
                leftmax=height[left];
                water+=leftmax-height[left];
                left++;
            }
            else{
                if(height[right] >= maxright)
                maxright=height[right];
                water+=maxright-height[right];
                right--;
            }
        }
        return water;
    }
}
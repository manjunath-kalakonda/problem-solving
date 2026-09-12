class Solution {
public:
    int maxArea(vector<int>& height) {
        int left=0;
        int right=height.size()-1;
        int maxwater=0;
        while(left<right){
            int area=min(height[left],height[right])*(right-left);
            maxwater=max(area , maxwater);
            if(height[left] < height[right])
            left++;
            else
            right--;
        }
        return maxwater;
    }
};
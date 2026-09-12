class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> list = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need=target-nums[i];
            if(list.containsKey(need)){
                return new int[]{list.get(need),i};
            }
            list.put(nums[i],i);
        }
        return new int[]{};
    }
}
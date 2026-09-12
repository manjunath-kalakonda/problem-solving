class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int count=1;
                int x=i;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}
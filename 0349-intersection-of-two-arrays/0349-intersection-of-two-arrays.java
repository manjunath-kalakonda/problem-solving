class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> res=new HashSet<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i : nums1)
        res.add(i);
        for(int j : nums2){
            if(res.contains(j))
            set.add(j);
        }
        int[] ans=new int[set.size()];
        int i=0;
        for(int j : set)
        ans[i++]=j;
        return ans;
    }
}
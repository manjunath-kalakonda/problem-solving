class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<2)
        return s;
        int st=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int len1=palindrome(s,i,i);
            int len2=palindrome(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>end-st+1){
                st=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(st,end+1);
    }
    public int palindrome(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
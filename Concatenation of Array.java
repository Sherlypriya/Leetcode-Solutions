class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int p=n*2;
        int ans[]=new int[p];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[n+i]=nums[i];
        }
        return ans;
    }
}
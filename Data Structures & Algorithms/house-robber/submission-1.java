class Solution {
    public int theif(int i,int[] nums,int[] dp){

        if(i<0) return 0;

        if(i==0) return nums[0];

        if(dp[i]!=-1) return dp[i];

        int left = theif(i-1,nums,dp);
        

        int right=theif(i-2,nums,dp)+nums[i];
        
        dp[i]=Math.max(left,right);
        return dp[i];
        
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return theif(n-1,nums,dp);
        
    }
}

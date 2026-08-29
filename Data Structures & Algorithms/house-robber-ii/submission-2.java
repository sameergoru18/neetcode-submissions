class Solution {
    public int theif(int j,int i,int[] nums,int[] dp){
        if(i<j) return 0;

        if(dp[i]!=-1) return dp[i];

        int left = theif(j,i-1,nums,dp);
        int right = theif(j,i-2,nums,dp)+nums[i];
        
        dp[i]=Math.max(left,right);
        return dp[i];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        if(n==1) return nums[0];
        int left = theif(0,n-2,nums,dp);
        Arrays.fill(dp,-1);
        int right = theif(1,n-1,nums,dp);
        return Math.max(left,right);
        
    }
}

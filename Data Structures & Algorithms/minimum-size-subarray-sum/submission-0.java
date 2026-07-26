class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,n=nums.length,mn=100001,sum=0;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(l<=r && sum>=target){
                mn = Math.min(mn, r-l+1);
                sum-=nums[l++];
            }
        }
        return mn==100001?0:mn;
    }
}
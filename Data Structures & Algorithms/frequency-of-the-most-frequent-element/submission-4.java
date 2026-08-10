class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length, l = 0, ans=1;
        Arrays.sort(nums);
        long sum = 0l;
        sum+=nums[0];
        for(int r=1;r<n;r++){
            while(l<r && (nums[r]-sum)+(r-l-1)*nums[r]>k){
                sum-=nums[l++];
            }
            ans = Math.max(ans,r-l+1);
            sum+=nums[r];
        }
        return ans;
    }
}
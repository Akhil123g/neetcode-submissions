class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        int j=0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i]) && (i-mp.get(nums[i]))<=k){
                return true;
            }
            mp.put(nums[i],i);
        }
        return false;
    }
}
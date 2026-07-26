class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       int n = nums.length;
       Set<Integer> st = new HashSet<>();
       int j=0;
       for(int i=0;i<n;i++){
            if(i-j>k){
                st.remove(nums[j++]);
            }
            if(st.contains(nums[i])){
                return true;
            }
            st.add(nums[i]);
       }
       return false;
    }
}
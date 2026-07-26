class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int n = s.length(), j=0, mx=0;
        for(int i=0; i<n;i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
           
            while( j<i && mp.get(s.charAt(i))>1){
                mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j),0)-1);
                j++;
            }
             mx = Math.max(mx, i-j+1);
            
        }
        return mx;
    }
}

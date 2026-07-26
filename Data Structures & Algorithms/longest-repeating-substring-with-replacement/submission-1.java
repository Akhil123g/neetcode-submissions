class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> mp = new HashMap<>();
        int l=0, mx = 1,n=s.length(), windowFreq=0;
        for(int r=0;r<n;r++){  
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);         
            windowFreq = Math.max(mp.get(s.charAt(r)),windowFreq);               
            int wSize = r-l+1;    
            if((r-l+1)-windowFreq>k){               
                mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                l++;
            }  
            mx = Math.max(mx, r-l+1);
        }
        return mx;
    }
}

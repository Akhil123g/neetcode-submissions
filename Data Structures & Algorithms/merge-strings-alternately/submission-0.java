class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length(),m=word2.length();
        int i=0,j=0;
        String s="";
        while(i<n && j<m){
            s=s+word1.charAt(i++)+word2.charAt(j++)+"";
        }
        if(i<n){
            s=s+word1.substring(i);
        }
        if(j<m){
            s+=word2.substring(j);
        }
        return s;
    }
}
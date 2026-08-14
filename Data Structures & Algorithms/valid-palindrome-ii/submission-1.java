class Solution {
    boolean validate(String s,int i, int j){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i=0,j=n-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return validate(s,i,j-1) || validate(s,i+1,j);
            }
            i++;j--;
        }
        return true;
    }
}
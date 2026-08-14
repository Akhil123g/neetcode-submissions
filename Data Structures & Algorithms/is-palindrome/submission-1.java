class Solution {
    public boolean alphaN(char c){
        return (c<='z' && c>='a') || (c<='Z' && c>='A') ||(c<='9' && c>='0');  
    }
    public boolean isPalindrome(String s) {
        int n= s.length();
        int i=0,j=n-1;
        while(i<j && i<n && j>=0){
            while(i<n && !alphaN(s.charAt(i))){
                i++;
            }
            while(j>=0 && !alphaN(s.charAt(j))){
                j--;
            }
            if(i<j && i<n && j>=0 && s.toLowerCase().charAt(i++)!=s.toLowerCase().charAt(j--))
                return false;
        }
        return true;
    }
}

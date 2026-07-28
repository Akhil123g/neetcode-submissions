class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length, ele = Integer.MIN_VALUE,l=0;
        for(int i=k;i<n;i++){
            if(Math.abs(arr[i]-x)<Math.abs(arr[l]-x) || arr[i]==arr[i-1]){
                l++;
            } else {
                ele = i;
                break;
            }
        }
        List<Integer> result = new ArrayList<>();
        if(ele==Integer.MIN_VALUE){
            for(int i=n-k;i<n;i++){
               result.add(arr[i]);
            }
        } else {
            for(int i=ele-k;i<ele;i++){
               result.add(arr[i]);
            }
        }
        return result;
        
    }
}
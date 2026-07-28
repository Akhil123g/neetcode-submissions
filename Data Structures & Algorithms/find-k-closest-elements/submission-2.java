class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<k;i++){
            dq.offerLast(Math.abs(arr[i]-x));
        }
        int ele = Integer.MIN_VALUE;
        for(int i=k;i<n;i++){
            if(Math.abs(arr[i]-x)<dq.peekFirst() || arr[i]==arr[i-1]){
                dq.pollFirst();
                dq.offerLast(Math.abs(arr[i]-x));
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
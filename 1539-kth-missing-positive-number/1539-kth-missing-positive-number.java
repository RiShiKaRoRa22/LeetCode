class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            int missing=arr[mid]-mid-1;
            if(missing<k){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return start+k;

        /*int var=1;
        int cnt=0;
        Set<Integer> set= new HashSet<>();
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            set.add(i);
            max=Math.max(max,i);
        }

        for(int i=1;i<max+1;i++){
            if(cnt<k && !set.contains(i) ){
                cnt++;
            }
            else if(cnt==k){
                return i-1;
            }

        }
        
        return max+k-cnt;*/
       

        
    }
}
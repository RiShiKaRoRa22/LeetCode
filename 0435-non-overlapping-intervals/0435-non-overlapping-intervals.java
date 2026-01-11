class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        //sort
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int[] curr=intervals[0];
        int[] next=intervals[0];
        List<int[]> list= new ArrayList<>();
        list.add(curr);
        for(int i=1;i<intervals.length;i++){
            next=intervals[i];
            if(curr[1]>next[0]){
                //curr[1]=Math.max(curr[1],next[1]);

            }
            else{
                curr=next;
                list.add(curr);
            }
        }
        return intervals.length-list.size();
        
    }
}
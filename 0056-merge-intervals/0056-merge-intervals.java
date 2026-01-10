class Solution {
    public int[][] merge(int[][] intervals) {
        //sort based on start time
        //check end of first<=start of next- overalp
        //merge aka take start of first and end of last, and insert, do this for all
        //sorting based on start values;

        List<int[]> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        list.add(intervals[0]);
        int[] curr= intervals[0];
        int[] next= intervals[0];

        for(int i=1;i<intervals.length;i++){
            next=intervals[i];

            
            if(curr[1]>=next[0]){
                //merge
                curr[1]=Math.max(curr[1],next[1]);
                
      
            }
            else{
               curr=next;
               list.add(curr);

            }

        }
        int i=0;
        int j=0;
        int[][] a= new int[list.size()][2];
        for(int[] l: list){
            j=0;
            for(int li:l){
                a[i][j]=li;
                j++;

            }
            i++;
        }
        return a;



        
    }

}
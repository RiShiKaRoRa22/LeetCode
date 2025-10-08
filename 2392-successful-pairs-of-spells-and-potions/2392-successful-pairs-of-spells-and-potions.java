class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int pairs[]=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
          int start= 0;
          int end=potions.length-1;
          int index=potions.length;
          while(start<=end){
            int mid= (start+end)/2;
            if((long)spells[i]*potions[mid]>=success){
                end=mid-1;
                index=mid;
            }
            else{
                start=mid+1;
            }
          }
          pairs[i]=potions.length-index;
        }
        return pairs;
        
    }
}
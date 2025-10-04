import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {

        /*for(int i=0;i<k;i++){
            int start=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];

            }
            nums[0]=start;

        }*/
        
        int len= nums.length;

        k=k%len;
        int i=0;
        int j=len-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;

        }
        

       
        i=0;
        j=k-1;

        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;

        }

        i=k;
        j=len-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;

        }

        
        
    }
}
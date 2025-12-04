class Solution {
    public int countCollisions(String directions) {
        char arr[]= directions.toCharArray();
        int i=0;
        for(char ch: arr){
            if(ch=='L'){
                i++;
            }
            else{
                break;
            }
        }

        int j=0;
        for(j=arr.length-1;j>=0;j--){
           if(arr[j]=='R'){

           }
           else{
            break;
           }
            
        }
        int sum=0;
        for(int k=i;i<=j;i++){
            if(arr[i]!='S'){
                sum++;
            }

        }
        return sum;
    }
}
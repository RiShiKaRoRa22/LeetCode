class Solution {
    public int sumSubarrayMins(int[] arr) {
        //int sum=0;
        
        /*for(int i=0;i<arr.length;i++){
            Stack<Integer> stack= new Stack<>();
            for(int j=i;j<arr.length;j++){
                if(stack.isEmpty()){
                stack.push(arr[j]);
                }
                else if(arr[j]<stack.peek()){
                    stack.pop();
                    stack.push(arr[j]);
                }
                sum=(sum+stack.peek())%(int)(Math.pow(10,9)+7);
        }
    }
    return sum% (int) (Math.pow(10,9)+7);    */ 
    //BRUTE FORCE- GIVES TLE

    //OPTIMIZED
    int left[]= new int[arr.length];
    int right[]=new int[arr.length];
    Stack<Integer> stack= new Stack<>();

    for(int i=0;i<arr.length;i++){
        while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
            stack.pop();
        }
        if(stack.isEmpty()){
            left[i]=i+1;
        }
        else{
            left[i]=i-stack.peek();
        }
        stack.push(i);
    }
    stack.clear();

    for(int i=0;i<arr.length;i++){
        while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
            int ind= stack.pop();
            right[ind]=i-ind;
        }
        stack.push(i);
       
    }
    int n= arr.length;
    while(!stack.isEmpty()){
        int idx= stack.pop();
        right[idx]=n-idx;
    }

    long sum=0;
    for(int i=0;i<arr.length;i++){
        sum=(sum+((long)arr[i]*right[i]*left[i]))%(long)(Math.pow(10,9)+7);
    }
    return (int)sum;




    
    }
}
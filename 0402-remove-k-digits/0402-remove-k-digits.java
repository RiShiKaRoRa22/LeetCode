class Solution {
    public String removeKdigits(String num, int k) {
        //brute force 
        Stack<Integer> stack= new Stack<>();
        
        int j=0;
        
        for(char i: num.toCharArray()){
            
            while(!stack.isEmpty() && i-'0'<stack.peek() && j<k){
                stack.pop();
                j++;
            }
            stack.push(i-'0');
        }

        while(!stack.isEmpty() && j<k){
            stack.pop();
            j++;
        }

        /*int res=0;
        for(int i:stack){
            res=res*10+i;
        }
        /*while(res>0){
            int a=res%10;
            sum=sum*10+a;
            res=res/10;
            

        }*/
        /*return Integer.toString(res); INTEGER OVERFLOW */

        StringBuilder sb= new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        int idx=0;
        for(char i:sb.toString().toCharArray()){
            if(i!='0'){
                break;
            }
            idx++;
        }
        String s=sb.substring(idx);

        return s.isEmpty()?"0":s;



        
    }
}
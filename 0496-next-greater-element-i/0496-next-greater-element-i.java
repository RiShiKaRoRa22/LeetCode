class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack= new Stack<>();
        int result[]= new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums2[i] ){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i]=-1;    
            }
            else if(stack.peek()>nums2[i]){
                result[i]=stack.peek();

            }
        
            stack.push(nums2[i]);
            

        }

        Map<Integer,Integer> nums2map= new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            nums2map.put(nums2[i],i);
        }
        int res[]= new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int index=nums2map.get(nums1[i]);
            res[i]=result[index];

        }
        return res;

        
        
    }
}
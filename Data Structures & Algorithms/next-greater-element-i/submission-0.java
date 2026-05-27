class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        for(int n:nums2){
            while(!st.empty() && n>st.peek()){
             hashmap.put(st.pop(),n);
            }
            st.push(n);
        }
        while(!st.empty()){
            hashmap.put(st.pop(),-1);
        }
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
           ans[i]=hashmap.get(nums1[i]);
        }
        return ans;
    }
}
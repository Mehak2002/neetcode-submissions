class Solution {
    public int missingNumber(int[] nums) {
        int es=0;
        int n=nums.length;
        es=n*(n+1)/2;
          int os=0;
        for(int i:nums){
          
            os=os+i;
        }
        return es-os;
    }
}

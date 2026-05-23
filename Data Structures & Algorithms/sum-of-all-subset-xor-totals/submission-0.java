class Solution {
    public int subsetXORSum(int[] nums) {
        if(nums.length==0)return 0;
        int or=0;
        for(int n:nums){
            or|=n;
        }
        return or * (1<< (nums.length)-1);
    }
}
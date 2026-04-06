class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1){
            return 0;
        }
        Arrays.sort(nums);
        int diff=0;
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            diff=nums[i+k-1]-nums[i];
            mindiff=Math.min(mindiff,diff);
                }

       return mindiff;         
    }
}
class Solution {
    public boolean divideArray(int[] nums) {
        int[] freq=new int[501];
        for(int n:nums){
          freq[n]++;
        }
        for(int h:freq){
          if(h%2!=0) return false;
        }
        return true;
    }
}
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> s1=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(s1.contains(nums[i])){
                return true;
            }
            s1.add(nums[i]);
            if(i>=k){
                s1.remove(nums[i-k]);
            }
        } 
        return false;
    }
}
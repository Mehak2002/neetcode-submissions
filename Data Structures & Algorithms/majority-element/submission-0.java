class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> hash=new HashMap<>(); 
        for(int i=0;i<n;i++){
            if(hash.containsKey(nums[i])){
                hash.put(nums[i],hash.get(nums[i])+1);
            }
            else{
           hash.put(nums[i],1);
            }
        }
        for(int key:hash.keySet()){
        if(hash.get(key)>n/2){
            return key;
        }
        }
        return -1;
    }
}
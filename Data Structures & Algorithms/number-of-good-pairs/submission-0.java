class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int n:nums){
            if(map.containsKey(n)){
                count+=map.get(n);
            }
            map.put(n,map.getOrDefault(n,0)+1);
        }
        return count;
    }
}
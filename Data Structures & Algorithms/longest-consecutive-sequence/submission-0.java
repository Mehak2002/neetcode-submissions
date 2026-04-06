class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        
        int longest=0;
        for(int j:set){
          if(!set.contains(j-1)){
            int current=j;
            int count=1;
          
          while(set.contains(current+1)){
            current++;
            count++;

          }
          longest=Math.max(longest,count);
        }
        }
        return longest;
    }
}

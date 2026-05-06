class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        helper(0,nums,new ArrayList<>(),res);
        return res;
    }
    public void helper(int start,int[]nums,List<Integer>temp,List<List<Integer>> res){
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            helper(i+1,nums,temp,res);
            temp.remove(temp.size()-1);
        }
    }
}

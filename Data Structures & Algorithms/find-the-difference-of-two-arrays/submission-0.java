class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        for(int n:nums1){
            s1.add(n);
        }
        for(int k:nums2){
            s2.add(k);
        }
        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        for(int j:s1){
            if(!s2.contains(j)){
                l1.add(j);
            }
        }
        for(int h:s2){
            if(!s1.contains(h)){
                l2.add(h);
            }
        }
        List<List<Integer>> answer=new ArrayList<>();
        answer.add(l1);
        answer.add(l2);
      return answer;
    }
}
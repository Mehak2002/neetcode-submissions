class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer>resultSet=new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }
        for(int i:nums2)
        {
            if(set1.contains(i)){
                resultSet.add(i);
            }
        }
        int res[]=new int[resultSet.size()];
        int indx=0;
        for(int u:resultSet){
            res[indx++]=u;
        }
        return res;
    }
}
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map=new HashMap<>();
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int j=0;
        String[] ans=new String[heights.length];
        for(int i=names.length-1;i>=0;i--){
            ans[j++]=map.get(heights[i]);
        }

        return ans;
    }
}
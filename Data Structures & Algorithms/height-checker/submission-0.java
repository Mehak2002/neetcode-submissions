class Solution {
    public int heightChecker(int[] heights) {
        int[] heights1=heights.clone();
        Arrays.sort(heights1);
        int c=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=heights1[i])c++;
        }
        return c;
    }
}
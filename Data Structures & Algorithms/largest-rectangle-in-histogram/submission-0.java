class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer>stack=new Stack<>();
        int maxArea=0;
        for(int i=0;i<=n;i++){
            int currheight=(i==n)?0:heights[i];
            while(!stack.isEmpty() && currheight<heights[stack.peek()]){
                int height=heights[stack.pop()];
                int width;
                if(stack.isEmpty()){
                    width=i;
                }
                else{
                    width=i-stack.peek()-1;
                }
                int area=width*height;
                maxArea=Math.max(maxArea,area);

            } 
            stack.push(i);
        } 
        return maxArea;
    }
}

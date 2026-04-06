class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;
        int []freq=new int[size+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                freq[grid[i][j]]++;
            }
        }
        int repeat=-1;
        int missing=-1;
        for(int y=1;y<=size;y++){
            if(freq[y]==2)repeat=y;
            if(freq[y]==0)missing=y;
        }
        return new int[]{repeat,missing};
    }
}
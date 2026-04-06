class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int l=-1;
        for(int i=n-1;i>=0;i--){
            int c=arr[i];
           arr[i]=l;
           l=Math.max(l,c);
        }
        return arr;
    }
}
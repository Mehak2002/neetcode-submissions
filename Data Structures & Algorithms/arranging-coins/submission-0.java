class Solution {
    public int arrangeCoins(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(n>0){
            n=n-i;
            c++;}
            if(n==0){
                return c;
            }
        }
        return c;
    }
}
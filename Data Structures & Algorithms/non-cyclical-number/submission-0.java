class Solution {
    private int squaresum(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
       
        int slow=n;
        int fast=n;
        do{
            slow=squaresum(slow);
            fast=squaresum(squaresum(fast));
        }while(slow!=fast);

        return slow==1;
    }
}

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int p:piles){
            right=Math.max(p,right);
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canEat(piles,mid,h)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}
private boolean canEat(int[]piles,int k,int h){
int hours=0;
for(int p:piles){
    hours+=(p+k-1)/k;
}
return hours<=h;
}
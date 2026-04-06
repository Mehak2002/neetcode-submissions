class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int[]res=new int[l];
        res[0]=1;
        for(int i=1;i<l;i++){
            res[i]=nums[i-1]*res[i-1];
        }
        int right=1;
        for(int j=l-1;j>=0;j--){
            res[j]=res[j]*right;
            right=right*nums[j];
        }
        return res;

    }
}  

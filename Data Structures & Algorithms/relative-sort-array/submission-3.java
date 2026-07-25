class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
       int[] freq=new int[1001];
       for(int y:arr1){
        freq[y]++;
       } 
       int index=0;
       for(int j:arr2){
        while(freq[j]>0){
         arr1[index++]=j;
         freq[j]--;
        }
       }
       for(int i=0;i<=1000;i++){
        while(freq[i]>0){
            arr1[index++]=i;
            freq[i]--;
        }
       }
       return arr1;
    }
}
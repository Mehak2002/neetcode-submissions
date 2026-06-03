class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] first=new int[26];
        for(int i=0;i<26;i++){
            first[i]=-1;

        }
        int max=-1;
        for(int i=0;i<s.length();i++){
            int indx=s.charAt(i)-'a';
            if(first[indx]==-1){
                first[indx]=i;
            }
            else{
                max=Math.max(max,i-first[indx]-1);
            }
        }
        return max;
    }
}
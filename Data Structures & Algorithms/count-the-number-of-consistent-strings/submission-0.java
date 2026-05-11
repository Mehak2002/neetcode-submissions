class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean []arr=new boolean[26];
        for(char ch:allowed.toCharArray()){
            arr[ch-'a']=true;
        }
        int count=0;
        for(String word:words){
            boolean ok=true;
            for(char ch:word.toCharArray()){
                if(!arr[ch-'a']){
                    ok=false;
                    break;
                }
            }
            if(ok)count++;
        }
        return count;
    }
}
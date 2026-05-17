class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq=new int[26];
        for(String word:words){
        for(char c:word.toCharArray()){
            freq[c-'a']++;
        }
        }
        int count=words.length;
        for(int v:freq){
            if(v%count!=0 )return false;
        }
        return true;
    }

}
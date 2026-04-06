class Solution {
    public int countCharacters(String[] words, String chars) {
        int[]charFreq=new int[26];
          for(char c : chars.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                charFreq[c - 'a']++;
            }
        }
    
         int total=0;
        for(String word:words){
             int[]wordFreq=new int[26];
             for(char c:word.toCharArray()){
                  if(c >= 'a' && c <= 'z'){
            wordFreq[c-'a']++;
                  }
             }
        boolean good=true;
      
        for(int i=0;i<26;i++){
            if(wordFreq[i]>charFreq[i]){
             good=false;
             break;
            }
        
        }
         if(good){
                total+=word.length();
     
            }
        }
        return total;
    }
}
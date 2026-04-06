class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);

            }
            else{
                map.put(ch,1);
            }
        }
       int maxo = Integer.MIN_VALUE;
int mini = Integer.MAX_VALUE;
        for(char k:map.keySet()){
        
            int freq=map.get(k);
            if(freq%2==0){
               mini=Math.min(mini,freq);
            }
            else{
              
                    maxo=Math.max(maxo,freq);
                
            }

        }
        return maxo-mini;
    }
}
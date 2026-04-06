class Solution {
    public boolean isAnagram(String s, String t) {
          if(s.length()!=t.length()){
            return false;
          }
          Map<Character,Integer>map=new HashMap<>();
          for(char c : s.toCharArray()){
             map.put(c, map.getOrDefault(c, 0) + 1);
          }
          for(char m:t.toCharArray()){
            if(!map.containsKey(m)){
                return false;
            }
           map.put(m, map.get(m) - 1);
            if(map.get(m) <0)
            {
                return false;
            }
          }
          return true;
    }
}

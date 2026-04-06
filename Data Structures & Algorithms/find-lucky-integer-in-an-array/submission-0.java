class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int lucky=-1;
        for(int k:arr){
            if(map.containsKey(k)){
                map.put(k,map.getOrDefault(k,0)+1);
             }else{
                map.put(k,1);
             }
            
        }
         for(int key:map.keySet()){
            if(key==map.get(key)){
                lucky=  Math.max(key,lucky);
            }
        }
    
        return lucky;
    }
}
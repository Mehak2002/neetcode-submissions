class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer> freq=new HashMap<>();
      for(int n:nums){
        freq.put(n,freq.getOrDefault(n,0)+1);
      }  
     List<Integer>[]buckets=new List[nums.length+1];
     for(int i:freq.keySet()){
        int frequency=freq.get(i);
        if(buckets[frequency]==null){
           buckets[frequency]= new ArrayList<>();
        }
        buckets[frequency].add(i);
     }
     int indx=0;
     int[] res=new int[k];
     for(int l=buckets.length-1;l>=0 && indx<k;l--){
        if(buckets[l]!=null){
            for(int n:buckets[l]){
                res[indx++]=n;
                if(indx==k)break;
            }
        }
     }
     return res;
    }  
}

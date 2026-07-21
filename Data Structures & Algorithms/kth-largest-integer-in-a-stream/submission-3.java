class KthLargest {
     private int k;
     private PriorityQueue<Integer> minheap;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        minheap=new PriorityQueue<>();
        for(int n:nums){
            add(n);
        }
    }
    
    public int add(int val) {
        minheap.offer(val);
        if(minheap.size()>k){
            minheap.poll();
        }
        return minheap.peek();
    }
}

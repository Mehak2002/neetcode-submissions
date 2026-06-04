class Solution {
    public int maxScore(String s) {
        int ones=0;
        for(char c:s.toCharArray()){
            if(c=='1') ones++;
        }
        int zeros=0;
        int rightones=ones;
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0') zeros++;

           else{rightones--;
           }
           max=Math.max(max,zeros+rightones);
        }
        return max;
    }
}
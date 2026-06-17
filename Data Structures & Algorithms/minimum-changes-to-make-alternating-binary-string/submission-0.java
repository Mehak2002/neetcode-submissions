class Solution {
    public int minOperations(String s) {
        int zero=0;
        int one =0;
        for(int i=0;i<s.length();i++){
            char zeroExpected=(i%2==0)?'0':'1';
            char oneExpected=(i%2==0)?'1':'0';
            if(s.charAt(i)!=zeroExpected) zero++;
            if(s.charAt(i)!=oneExpected)one++;
        }
        return Math.min(zero,one);
    }
}
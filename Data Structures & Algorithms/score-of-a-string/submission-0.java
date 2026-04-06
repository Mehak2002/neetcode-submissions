class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int total=0;
        for(int i=1;i<n;i++){
            int new1=s.charAt(i)-'a';
            int old=s.charAt(i-1)-'a';
        int diff=Math.abs(new1-old);
        total+=diff;
        }
        return total;
    }
}
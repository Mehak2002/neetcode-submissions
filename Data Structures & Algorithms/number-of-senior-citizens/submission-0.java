class Solution {
    public int countSeniors(String[] details) {
        if(details.length==0)return 0;
        int c=0;
        for(int i=0;i<details.length;i++){
            int n= Integer.parseInt(details[i].substring(11,13));
            if(n>60){
               c++;
            }
        }
        return c;
    }
}
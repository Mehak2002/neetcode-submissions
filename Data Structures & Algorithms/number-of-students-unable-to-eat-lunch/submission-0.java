class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circle=0;
        int square=0;
        for(int s:students){
            if(s==0)circle++;
            else square++;
        }
        for(int t:sandwiches){
            if(t==0){
                if(circle==0) return square;
                else circle--;
            }
            else {
                if(square==0)return circle;
                else square--;

            }
            
        }
        return 0;
    }
}
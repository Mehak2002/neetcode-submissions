class Solution {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y=0;
        HashSet<String>hash=new HashSet<>();
        hash.add("0,0");
        for(char c:path.toCharArray()){
            if(c=='N')y++;
            else if(c=='S') y--;
            else if(c=='E')x--;
            else x++;

             String pos = x + "," + y;
            if(hash.contains(pos))return true;

            hash.add(pos);
        }
        return false;
    }
}
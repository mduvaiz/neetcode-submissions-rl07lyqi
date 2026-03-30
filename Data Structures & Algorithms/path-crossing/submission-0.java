class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        HashSet<String> set = new HashSet<>();
        char path1[] = path.toCharArray();
        set.add("0,0");
        for(char c : path1){
            if(c=='N')  y++;
            if(c=='S')  y--;
            if(c=='W')  x--;
            if(c=='E')  x++;
            
        String pos = x + "," + y;
            if(set.contains(pos)){
                return true;
            }
            set.add(pos);
        }
        return false;
    }
}

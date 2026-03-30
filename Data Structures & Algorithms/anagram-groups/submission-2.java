class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            char w [] = strs[i].toCharArray();
            Arrays.sort(w);
            String key = new String(w);
            if(map.containsKey(key)){
                map.get(w);
                List <String> list = map.get(key);
                list.add(strs[i]);
            }else{
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                map.put(key, newList);
        }
        }
        return new ArrayList<>(map.values());
    }
}
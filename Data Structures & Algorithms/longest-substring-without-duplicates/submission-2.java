class Solution {
    public int lengthOfLongestSubstring(String s) {
        char [] arr = s.toCharArray();
        int l=0,r=0, maxLength=0;
        HashSet <Character>set = new HashSet<>();
        while(r<arr.length){
            while(set.contains(arr[r])){
                set.remove(arr[l]);
                l++;
            }if(!set.contains(arr[r])){
                set.add(arr[r]);
            }r++;
            maxLength = Math.max(maxLength, r-l);
        }
        return maxLength;
    }
}
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap <Character,Integer> map = new HashMap<>();
        int l = 0, r = 0, maxFreq = 0, maxLength = 0; boolean invalid;
        for(r = 0; r<s.length();r++){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));
            if(r-l+1 - maxFreq > k){ //(boolean invalid = r-l+1 -maxFreq > k)
            map.put(s.charAt(l), map.get(s.charAt(l))-1);
            l++;
                }
            maxLength = Math.max(maxLength, r - l+1);
        } 
        return maxLength;
    }
}

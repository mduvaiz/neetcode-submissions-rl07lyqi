class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashSet<Character> set = new HashSet<>();
     char arr[] = s.toCharArray();
     int result = 0,left=0;
     for (int right = 0; right < arr.length; right++) {
    while (set.contains(arr[right])) {
        set.remove(arr[left]);
        left++;
    }
    set.add(arr[right]);
    result = Math.max(result, right - left + 1);
     }
        return result;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxlen = 0;

        for (int right = 0; right < s.length(); right++) {

            // duplicate aaya -> shrink window
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));  // ✅ FIX
                left++;
            }

            // add current character
            set.add(s.charAt(right));

            // update max
            maxlen = Math.max(maxlen, right - left + 1);
        }

        return maxlen;
    }
}
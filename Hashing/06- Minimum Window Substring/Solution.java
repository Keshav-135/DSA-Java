class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] freq = new int[128];

        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int left = 0;
        int matched = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (freq[ch] > 0) {
                matched++;
            }

            freq[ch]--;

       
            while (matched == t.length()) {

                if (right - left + 1 < minLen) {

                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                freq[leftChar]++;

                if (freq[leftChar] > 0) {
                    matched--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}

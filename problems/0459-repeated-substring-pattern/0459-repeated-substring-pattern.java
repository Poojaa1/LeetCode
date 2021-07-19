class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() <2) return false;
        int patternLen = 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) != s.charAt(i % patternLen)) {
                patternLen++;
                if (patternLen > (s.length() >>> 1)) return false;
                i = patternLen - 1;
            }
        }
        return s.length() % patternLen == 0;
    }
}
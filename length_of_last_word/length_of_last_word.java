class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.trim().split("\s+");
        String ss = str[str.length-1];
        int stringLength = ss.replace(" ", "").length();
        return stringLength;
    }
}
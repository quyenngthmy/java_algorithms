class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1)
            return strs[0];
        Arrays.sort(strs);
        int len=strs[0].length();
        
        StringBuilder builder =new StringBuilder();
        
        int c=0;
        while(c<len){
            if(strs[0].charAt(c)==strs[strs.length-1].charAt(c)){
                builder.append(strs[0].charAt(c));
            }
            else{
                break;
            }
            c++;
        }
        return builder.toString();
    }
}
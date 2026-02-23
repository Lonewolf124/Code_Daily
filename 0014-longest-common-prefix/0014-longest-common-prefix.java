class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs ==  null || strs.length == 0 ) return "";
        int minlength  = Integer.MAX_VALUE;
        for (String str : strs ){
            minlength = Math.min(str.length(),minlength);
             
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < minlength ;i++){
            char ch = strs[0].charAt(i);
            for (int j = 0 ; j < strs.length ;j++){
                if (strs[j].charAt(i) != ch ){
                    return sb.toString();
                }
            }
            sb.append(ch);

            
        }


        return sb.toString();

        

    }
}
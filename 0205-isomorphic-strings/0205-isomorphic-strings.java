class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character,Character> mapS_T = new HashMap<>();
        HashMap<Character,Character> mapT_S = new HashMap<>();

        for(int i=0; i<s.length();i++){
            char st = s.charAt(i);
            char ts = t.charAt(i);

            //forward mapping 
            if (mapS_T.containsKey(st)){
                if(mapS_T.get(st)!=ts) return false;
            } 
            else {
                mapS_T.put(st,ts);
            }
            
            //reverse mapping 
            if (mapT_S.containsKey(ts)){
                if(mapT_S.get(ts)!=st) return false;
            } 
            else {
                mapT_S.put(ts,st);
            }
        }
        return true;

    }
}
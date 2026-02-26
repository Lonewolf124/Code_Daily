class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        // now we have counted the freq of chars

        List<Character> list = new ArrayList<>(map.keySet());
        
        // comparing and sorting using lamda function(Very important)
        list.sort((a,b)->map.get(b)- map.get(a));

        //list = [e,t,r]
        StringBuilder sb = new StringBuilder();
        for (char ch : list){
            //count how many times a character exists
            int count = map.get(ch);
            while(count-- > 0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
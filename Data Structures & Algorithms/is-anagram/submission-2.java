class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sCount = new HashMap<>();
        if(s.length() == t.length()) {
            for(int i = 0; i < s.length(); i++){
                if(!sCount.containsKey(s.charAt(i))){
                    sCount.put(s.charAt(i), 1);
                } else {
                    sCount.put(s.charAt(i), sCount.get(s.charAt(i)) + 1);
                }
            }

            HashMap<Character, Integer> tCount = new HashMap<>();
            for(int j = 0; j < t.length(); j++){
                if(!tCount.containsKey(t.charAt(j))){
                    tCount.put(t.charAt(j), 1);
                } else {
                    tCount.put(t.charAt(j), tCount.get(t.charAt(j)) + 1);
                }
            }

            if(sCount.equals(tCount)){
                return true;
            }
        }

        return false;
    }
}

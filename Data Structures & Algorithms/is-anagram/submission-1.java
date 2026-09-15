class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> letterCount = new HashMap<>();
        if(s.length() == t.length()) {
            for(int i = 0; i < s.length(); i++){
                if(!letterCount.containsKey(s.charAt(i))){
                    letterCount.put(s.charAt(i), 1);
                } else {
                    letterCount.put(s.charAt(i), letterCount.get(s.charAt(i)) + 1);
                }
            }

            HashMap<Character, Integer> letterCount2 = new HashMap<>();
            for(int j = 0; j < t.length(); j++){
                if(!letterCount2.containsKey(t.charAt(j))){
                    letterCount2.put(t.charAt(j), 1);
                } else {
                    letterCount2.put(t.charAt(j), letterCount2.get(t.charAt(j)) + 1);
                }
            }

            if(letterCount.equals(letterCount2)){
                return true;
            }
        }

        return false;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        // Store the data
        for(int i = 0; i < s.length(); i++){
            char character = s.charAt(i);

            if(map.containsKey(s.charAt(i))){
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }

        // Now compare
        for(int j = 0; j < t.length(); j++){
            char character = t.charAt(j);

            if(!map.containsKey(character)){
                return false;
            }

            map.put(character, map.get(character) - 1);

            if(map.get(character) < 0){
                return false;
            }
        }

        return true;
    }
}



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groupAnagrams = new HashMap<>();

        for(String string : strs){
            char[] stringCharArray = string.toCharArray();
            Arrays.sort(stringCharArray);
            String sortedString = new String(stringCharArray);
            groupAnagrams.putIfAbsent(sortedString, new ArrayList<>());
            groupAnagrams.get(sortedString).add(string);
        }

        return new ArrayList<>(groupAnagrams.values());
        
    }
}

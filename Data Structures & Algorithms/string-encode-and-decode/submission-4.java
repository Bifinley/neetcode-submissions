class Solution {

    public String encode(List<String> strs) {
        String encodedString = ""; 

        for(String string : strs){
            encodedString += string;
            encodedString += "`";
        }

        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> listOfDecodedStrings = new ArrayList<>();
        String decodedString = "";
        for(int i = 0; i < str.length(); i++){
            if('`' != str.charAt(i)){
                decodedString += str.charAt(i);
            } else {
                listOfDecodedStrings.add(decodedString);

                decodedString = "";
            }
        }

        return listOfDecodedStrings;
    }
}

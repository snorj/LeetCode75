class MergeStringAlternatively {
    // You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, 
    // starting with word1. If a string is longer than the other, 
    // append the additional letters onto the end of the merged string.

    public static String mergeAlternately(String word1, String word2) {
        int longestStringLength = Math.max(word1.length(), word2.length());
        String output = "";
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();
        
        for (int i=0; i<longestStringLength; i++) {
            if (i<word1.length()) {
                output = output + word1Array[i];
            }
            if (i<word2.length()) {
                output = output + word2Array[i];
            }
        }

        return output;
    }
}
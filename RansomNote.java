383. Ransom Note
==========================================================

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 =================================================================================================================================

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];  // Step 1
        for (int i = 0; i < magazine.length(); i++) {  // Step 2
            char ch = magazine.charAt(i);
            letters[ch - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) { // Step 3
            char ch = ransomNote.charAt(i);
            letters[ch - 'a']--;
            if (letters[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;  // Step 4
    }
}

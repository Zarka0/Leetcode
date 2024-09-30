class Solution {
    public boolean isValid(String word) {
        // Condition 1: Word must be at least 3 characters long
        if (word.length() < 3) return false;

        int digitCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Condition 2: Word must contain only digits and English letters
            if (!Character.isLetterOrDigit(ch)) return false;

            // Count digits
            if (Character.isDigit(ch)) {
                digitCount++;
            }
            // Count vowels and consonants (only for letters)
            else if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Condition 3: It must have at least one vowel and one consonant
        return vowelCount >= 1 && consonantCount >= 1;
    }

    // Helper method to check if a character is a vowel
    public boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}

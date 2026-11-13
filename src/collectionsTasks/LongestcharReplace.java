
public class LongestcharReplace{

    public static int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Increase character frequency
            freq[ch - 'A']++;

            // Find maximum frequency
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            // Shrink window if replacements exceed k
            while ((right - left + 1) - maxFreq > k) {

                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Update maximum window length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;

        int result = characterReplacement(s, k);

        System.out.println("Input String: " + s);
        System.out.println("K: " + k);
        System.out.println("Longest Repeating Character Length: " + result);
    }
}

public class PalindromeProcessor {
    public String longestPalindromeSubstring(String str) {
        for (int lenSub = str.length(); lenSub > 0; lenSub--) {
            for (int i = 0; i <= str.length() - lenSub; i++) {
                String sub = str.substring(i, i + lenSub);
                if (isPalindrome(sub)) return sub;
            }
        }
        return str.substring(0, 0);
        // keluarkan susbtring palindrome terpanjang
    }

    private boolean isPalindrome(String str) {
        StringBuilder reverse = new StringBuilder(str);
        reverse.reverse();
        String cmp = new String(reverse);
        return str.toLowerCase().equals(cmp.toLowerCase());
    }
}
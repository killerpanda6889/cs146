package HomeWork.HomeWork8;
import java.util.HashMap;

class HomeWork8 {
    public static int longestPalindrome(String s) {
        int count = 0;
        boolean odd = true;
        HashMap<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            chars.put(s.charAt(i),  chars.getOrDefault(s.charAt(i),0)+1);
        }

        for (int c : chars.values()) {
            if (odd && c % 2 == 1) {
                count += c;
                odd = false;
            } else if (c % 2 == 0) {
                count += c;
            } else {
                c -= 1;
                count += c;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s)); // Output will be 7
    }
}

public class longestStr_vowel {
    public static void main(String[] args) {
        String s = "abcaiebcae";
        int count = 0;
        int maxcount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count += 1;
                maxcount = Math.max(maxcount, count);
            } else {
                count = 0;
            }

        }
        System.out.println(maxcount);

    }
}

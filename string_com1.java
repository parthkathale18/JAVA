class string_com1 {
    public static void main(String[] args) {
        String s = "aaabbbccadde";
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        sb.append(s.charAt(i));

        while (i < s.length() - 1) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                i++;
            } else {
                sb.append(s.charAt(i + 1));
                i++;
            }
        }
        System.out.println(sb);
    }
}
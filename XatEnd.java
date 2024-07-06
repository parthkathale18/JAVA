public class XatEnd {
    public static void moveAllX(String str, int idx, int count, String newS) {

        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newS += 'x';
            }
            System.out.println(newS);
            return;
        }
        char curchar = str.charAt(idx);
        if (curchar == 'x') {
            count++;
            moveAllX(str, idx + 1, count, newS);
        } else {
            newS += curchar;// new string = new string + currchar
            moveAllX(str, idx + 1, count, newS);
        }

    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");
    }
}

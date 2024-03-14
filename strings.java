import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // String s = "abcd";
        // System.out.println(s);
        // System.out.println(name);
        // System.out.println(s.charAt(3));
        // System.out.println(s.indexOf("llo"));
        // System.out.println(s.length());
        // for (int i = 0; i < s.length(); i++) {
        // for (int j = i + 1; j <= s.length(); j++) {
        // System.out.println(s.substring(i, j));
        // }
        // }

        // INTERNING
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        String s3 = new String("hello");
        System.out.println(s1 == s3);// (==) checks address of both strings
        System.out.println(s1.equals(s3));
    }
}
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.println(a[k] + "");
                }
            }
            System.out.println();
        }
    }
}

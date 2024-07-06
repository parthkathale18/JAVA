import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("array is ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            System.out.println(a[i]);
        }

        System.out.println("enter element to be searched:");
        int elem = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] == elem) {
                System.out.println(elem + "found at" + i);
            } else {
                System.out.println("invalid input");
            }
        }
    }
}
import java.util.Scanner;

public class fibonacci {
    public static void printFactorial(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(a);
        printFactorial(b, a + b, n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        printFactorial(a, b, n);
    }
}

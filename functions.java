import java.util.Scanner;

/**
 * functions
 */
public class functions {

    public static void factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;

        }
        System.out.println("factorial:" + fact);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        factorial(n);

    }
}

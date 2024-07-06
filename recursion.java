import java.util.Scanner;

/**
 * recursion
 */
public class recursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        PD(n);
    }

    public static int PD(int n) {
        if (n == 1)
            return 1;
        int fact = PD(n - 1);
        fact = n * fact;
        return fact;
    }
}

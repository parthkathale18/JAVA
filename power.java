import java.util.Scanner;

class power {
    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return printPower(x, n / 2) * printPower(x, n / 2);
        } else {
            return x * printPower(x, n / 2) * printPower(x, n / 2);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int output = printPower(x, n);
        System.out.println(output);
    }
}
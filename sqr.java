import java.util.Scanner;
//sqaure pattern 
/**
 *******
 *******
 *******
 *******
 
 */
public class sqr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("n:");
        int n = sc.nextInt();
        System.out.println("m:");
        int m = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}

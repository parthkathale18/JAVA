import java.util.Scanner;

public class twoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter r and c");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] numbers = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter x");
        int x = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + "," + j + ")");
                }
            }

        }
    }
}

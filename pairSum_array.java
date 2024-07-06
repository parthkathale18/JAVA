import java.util.Arrays;
import java.util.Scanner;

public class pairSum_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("target");
        int target = sc.nextInt();

        findPairs(a, target);

    }

    public static void findPairs(int[] a, int target) {

        Arrays.sort(a);

        int left = 0;
        int right = a.length - 1;
        int count = 0;

        while (left < right) {
            int currentSum = a[left] + a[right];
            if (currentSum == target) {
                System.out.println("Pair " + a[left] + ", " + a[right]);
                left++;
                right--;
                count += 1;
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(count);
    }
}

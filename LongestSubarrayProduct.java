import java.util.*;

public class LongestSubarrayProduct {

    public static int longestSubarray(int[] nums, int target) {
        int maxLength = 0;
        int product = nums[0];
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            product *= nums[j];

            if (product < target) {
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
                if (j >= nums.length)
                    break;
                product /= nums[i];

            } else {
                product /= nums[i];
                i++;
            }

        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("size of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target product: ");
        int target = scanner.nextInt();

        int result = longestSubarray(nums, target);
        System.out.println("longest  subarray" + target + " is: " + result);

        scanner.close();
    }
}

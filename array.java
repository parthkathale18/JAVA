import java.util.Scanner;

public class array {

    public static void reverse(int i, int j, int[] array) {
        while (j > i) {
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for array elements
        int[] array = new int[5];
        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Reversing the array
        reverse(0, 3, array);

        // Displaying the reversed array
        System.out.print("Reversed array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

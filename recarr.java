import java.util.Scanner;

public class recarr {
    public static int findFirstOccurrence(int[] arr, int target, int index) {

        if (index >= arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return findFirstOccurrence(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] myArray = { 1, 5, 3, 5, 2, 7, 5 };
        int targetNumber = 5;
        int firstOccurrenceIndex = findFirstOccurrence(myArray, targetNumber, 0);
        if (firstOccurrenceIndex != -1) {
            System.out.println("First occurrence of " + targetNumber + " is at index: " + firstOccurrenceIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

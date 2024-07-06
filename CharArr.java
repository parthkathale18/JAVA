import java.util.Scanner;

public class CharArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline character left by nextInt()

        char[] charArray = new char[n];

        System.out.println("Enter your name: ");
        // Store the characters in the character array
        String input = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (i < input.length()) {
                charArray[i] = input.charAt(i);
            } else {
                charArray[i] = ' '; // Fill remaining positions with space
            }
        }

        // Display the character array
        System.out.println("Character array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        // Close the scanner
        sc.close();
    }
}

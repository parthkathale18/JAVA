import java.util.Scanner;

/**
 * main
 */
public class main {


    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 5 numbers
        int[] numbers = new int[5];

        // Input: Taking 5 numbers from the user
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("number" + i +":");
            numbers[i] = scanner.nextInt();
        }
        
        for (int j=0;j>i;j++){
            int temp = numbers[i];
            numbers[i]=numbers[j];
            numbers[j]=temp;
            j++;
            System.out.println(numbers[i]);
            }
   }

      
        
        
}

    

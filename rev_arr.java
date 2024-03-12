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
        
       int [] b = new int [5];
       int j=0;
       int x=4;
       while(j<=4){
        b[j]=numbers[x];
        j++;
        x--;
       }
       for(int z=0;z<=4;z++){
        System.out.println(b[z]);
       }

        

    }
    
} 
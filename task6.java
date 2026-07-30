// Task 6: to  Print all possible pairs of elements from an array of size n;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for( int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("All possible pairs of elements of arr:");
        for(int i = 0; i < n ; i ++){
            for(int j = i + 1; j < n ; j ++){
                System.out.println("("+arr[i] + "," +arr[j] + ")");

            }
        }
        sc.close();
    }
}

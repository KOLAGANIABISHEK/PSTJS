// Task 5 : To Find the Kth smallest element in the given  array ;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         System.out.print("Enter the value of K: ");
        int k = sc.nextInt();
        if (k >= 1 && k <= n) {
            Arrays.sort(arr);
            System.out.println(k + "th smallest element: " + arr[k - 1]);
        } else {
            System.out.println("Invalid value of K.");
        }

        sc.close();
    }
}
//TAsk 2 To Access and print the element at a given index in an array ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in the array: ");
        int  n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter the index number: ");
        int index = sc.nextInt();

        System.out.println("The element is " + arr[index]);

        sc.close();
    }
}
//TAsk 2 To Access and print the element at a given index in an array ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int arr[] = {12, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the index number: ");
        int index = sc.nextInt();

        System.out.println("The element is " + arr[index]);

        sc.close();
    }
}
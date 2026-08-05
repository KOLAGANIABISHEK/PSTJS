import java.util.Scanner;
@FunctionalInterface
interface LastDigitSum {
    int calculate(int a, int b);
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        LastDigitSum sum = (a,b) -> (a%10) + (b%10);
        System.out.println("sum of last two digits = " + sum.calculate(num1 , num2) );
        sc.close();
    }
}

//is Palindrome Number ?
import java.util.Scanner;
@FunctionalInterface
interface palindrome {
    boolean check(int number);
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 
        palindrome p = n -> {
            if(n < 0){
                return false;
            }
            int original = n;
            int reverse = 0;
            while(n > 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n /= 10;
            }
            return original == reverse;

        };
        if (p.check(number)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}

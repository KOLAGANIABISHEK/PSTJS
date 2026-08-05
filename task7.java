//Sum of even or odd digits
import java.util.Scanner;
public  class Main{
    interface DigitSums {
    int calculate(int numbers);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = sc.nextInt();
        System.out.println("Enter youe choice (1=even),(2=odd)");
        int choice = sc.nextInt();

        DigitSums evenSum = n -> {
            int sum = 0;
            while(n>0){
                int digit = n % 10;
                if(digit % 2 == 0){
                    sum += digit;
                }
                n /=10;
            }
            return sum;
            
        };
        DigitSums oddSum = n -> {
            int sum = 0;
            while(n>0){
                int digit = n % 10;
                if(digit % 2 != 0){
                    sum += digit;

                }
                  n /= 10;
            }
            return sum;
        };
        switch(choice){
            case 1:
                System.out.println("Sum of the even digits =" +evenSum.calculate(number));
                break;
            case 2:
                System.out.println("Sum of the odd digits =" +oddSum.calculate(number));
                break;
            default:
                System.out.println("Invalid choice");   
        }
        sc.close();
    }
}

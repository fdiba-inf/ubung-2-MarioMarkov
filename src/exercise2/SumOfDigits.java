package exercise2;
import java.util.Scanner;


public class  SumOfDigits{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int digit = input.nextInt();

        int a1 = digit%10;
        digit= digit/10;
        int a2 = digit%10;
        digit = digit/10;
        int sum =a1+a2+digit;
        System.out.println("Sum of digits: "+ sum);

       
    }

}
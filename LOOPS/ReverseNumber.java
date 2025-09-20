package loops;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int num = sc.nextInt();

        int sign = (num<0)? -1 : 1;
        num= Math.abs(num);
        int rev=0;
        while(num>0){
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }

        rev = rev * sign;
        System.out.println("Reversed of "+num+" is : "+rev);
        sc.close();
    }
}

//Find the largest among three numbers.
package conditionals;
import java.util.Scanner;

public class LargestOfThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is greater than "+ num2 + " & "+ num3);
        }else if(num2 >= num1 && num2 >= num3 ){
            System.out.println(num2 + " is greater than "+ num1 + " & "+ num3);
        }else{
            System.out.println(num3 + " is greater than "+ num1 + " & "+ num2);
        }
        sc.close();
    }
}

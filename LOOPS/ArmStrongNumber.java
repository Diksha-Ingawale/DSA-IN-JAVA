package loops;
import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        //int size = String.valueOf(num).length(); 
        // count digits automatically

        int copy = num;                 //count digits manually
        int count = 0;
        while(copy > 0){
            copy = copy / 10;   
            count++;
        }

        int temp = num;
        int sum = 0;
        while(num > 0){
            int LD = num % 10 ;
            sum += Math.pow(LD, count);
            num = num /10;
        }

        if(sum == temp){
            System.out.println(temp + " is an Armstrong");
        }else{
            System.out.println(temp + " is not an Armstrong");
        }
        sc.close();
    }
}

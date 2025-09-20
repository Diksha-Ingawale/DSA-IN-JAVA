package loops;
import java.util.Scanner;

public class NoOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        num=Math.abs(num); //handle -ve value
        int count=0;
        if(num==0){
            count=1;
        }
        else{
            while(num>0){
                num=num/10;
                count++;
            }
        }
        
        System.out.println("Number of Digits = "+count);
        sc.close();
    }
}

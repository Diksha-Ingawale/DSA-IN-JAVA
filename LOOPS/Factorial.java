package loops;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        int fact=1;
        if(n==0 || n==1){
            fact=1;
        }else{
            for(int i=1;i<=n;i++){
                fact*=i;
            }
        }
        System.out.println("Fatorial of "+n +" is: "+fact);
        sc.close();
    }
}

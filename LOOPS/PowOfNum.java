package loops;
import java.util.*;

public class PowOfNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Number and Power respectively:");
        int num = sc.nextInt();
        int pow = sc.nextInt();

        int result = 1;
        int i=1;
        
        while(i<=pow){
            result*=num;
            i++;
        }
        System.out.println("POwer is:"+ result);
        
        sc.close();
    }
}

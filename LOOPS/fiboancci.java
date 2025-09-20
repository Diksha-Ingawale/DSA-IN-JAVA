import java.util.Scanner;
public class fiboancci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number for fibonacci series:");
        int n = sc.nextInt();

        int n1=0;
        int n2=1;

        if(n>=1){
            System.out.print(n1);
        }
        if(n>=2){
            System.out.print(" "+n2);
        }

        int sum=0;
        for(int i=3;i<=n;i++){
            sum=n1+n2;
            System.out.print(" "+sum);            

            n1=n2;
            n2=sum;
        }

        sc.close();
    }
}

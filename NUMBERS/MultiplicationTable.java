import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();

        System.out.println("Table of "+num+" is:");

        for(int i=1;i<=10;i++){
            int result = num * i;
            System.out.println(num + " x " + i + " = "+result);
        }
        sc.close();
    }
}

//Print ASCII value of a given character.
package basics;
import java.util.Scanner;

public class AsciiValue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Character:");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch;

        System.out.println("Ascii value of "+ ch + " is "+ ascii);
        sc.close();
    }
}

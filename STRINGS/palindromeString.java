package strings;
import java.util.*;

public class palindromeString {
    public static int isPalindrome(char[] input, int len){
        int start=0;
        int end= len-1;
        while(start<=end){
            if(input[start] != input[end]){
                return 0;
            }
            start++;
            end--;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int len=sc.nextInt();

        String str = sc.next();
        char input[] = str.toCharArray();

        if(isPalindrome(input,len)==1){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}


package functions;

import java.util.Scanner;

public class SearchInString {
    public static int Search(String str, char target){
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return i;           //return index where found
            }
        }
        return -1;  //not found
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);

        int result = Search(str, ch);
        if(result != -1){
            System.out.println("Element found at index "+ result);
        }else{
            System.out.println("Element not found  "+ result);
        }
        sc.close();
    }
}

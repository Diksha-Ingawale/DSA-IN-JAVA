package strings;

import java.util.Scanner;

public class CheckJavaStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking two string inputs
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // Check if both strings are not empty
        if (!(str1.isEmpty()) && !(str2.isEmpty())) {

            // Case 1: Both strings contain ".java"
            if (str1.contains(".java") && str2.contains(".java")) {
                System.out.println("2");
            }
            // Case 2: Only one string contains ".java"
            else if (str1.contains(".java") || str2.contains(".java")) {
                System.out.println("1");
            }
            // Case 3: Neither contains ".java"
            else {
                System.out.println("0");
            }
        }
        // Case 4: One or both strings are empty
        else {
            System.out.println("-1");
        }

        sc.close(); // Close scanner to prevent resource leak
    }
}

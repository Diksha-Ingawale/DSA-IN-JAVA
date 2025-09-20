import java.util.Scanner;

//Write a program to take name and age as input and print:
//Hello <name>, you are <age> years old.

class HelloUser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = sc.next();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Hello "+name+", you are "+age+" years old.");
        sc.close();
    }
}
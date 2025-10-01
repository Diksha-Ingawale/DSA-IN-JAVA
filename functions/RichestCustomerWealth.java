package functions;

import java.util.Scanner;

class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int customerWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                customerWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, customerWealth);
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: rows and columns
        int m = sc.nextInt(); // number of customers
        int n = sc.nextInt(); // number of accounts per customer

        int[][] accounts = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }

        System.out.println(maximumWealth(accounts));
        sc.close();
    }
}


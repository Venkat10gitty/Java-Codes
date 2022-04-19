package venkat;

import java.util.Scanner;
public class Coin {
    public static void main(String[] args) {
        int num, sumGold = 0, sumSilver = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of customers: ");
        num = in.nextInt();

        String[] names = new String[num];
        int[] cust_no = new int[num];

        for (int i = 0; i < num; i++) {
            String junk = in.nextLine();

            System.out.println("Enter name: ");
            names[i] = in.nextLine();

            System.out.println("Enter customer no.: ");
            cust_no[i] = in.nextInt();

            for (i = 0; i < num; i++) {
                if (cust_no[i] % 250 == 0) {
                    System.out.println("Gold: " + names[i]);
                    sumGold++;
                } else if (cust_no[i] % 100 == 0) {
                    System.out.println("Silver: " + names[i]);
                    sumSilver++;
                }
            }

            System.out.println("\nTotal no. of Gold coins: " + sumGold);
            System.out.println("\nTotal no. of Silver coins: " + sumSilver);
        }
    }
}
package venkat;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception {
    public  MyException(String s) {
        System.out.println(s);
    }
}
public class NilDA2Q1 {
    public static void main(String[] args) {
        int pin, balance = 10000;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome!!\nEnter the Pin Number: ");
        pin = in.nextInt();
        while(pin!=1234) {
            try {
                if (pin != 1234)
                    throw new MyException("Invalid Pin number");
                else
                    System.out.println("Accessing your account:\nBalance Available: 10000 ");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Enter valid pin number: ");
            pin = in.nextInt();
        }
        System.out.println("Accessing your account:\n");
        String category;
        System.out.println("Enter action (Deposit or Withdraw) : ");
        String junk = in.nextLine();
        category = in.nextLine();

        switch (category) {
            case "Deposit":
                int hun, five_hun, two_thou;
                System.out.println("Enter number of 100/- notes to be denominated: ");
                hun = in.nextInt();
                System.out.println("Enter number of 500/- notes to be denominated: ");
                five_hun = in.nextInt();
                System.out.println("Enter number of 2000/- notes to be denominated: ");
                two_thou = in.nextInt();

                balance += (100 * hun) + (500 * five_hun) + (2000 * two_thou);
                System.out.println("Balance in the Account: " + balance);
                break;
            case "Withdraw":
                int choice;
                System.out.println("Enter amount to be withdrawn (multiples of 100 only): ");
                choice = in.nextInt();
                int k = choice % 100;
                while(k!=0 || choice > balance ) {
                    try {
                        if (k != 0) {
                            throw new MyException("Enter denominations in multiples of 100");
                        }
                    } catch (MyException e) {
                        e.printStackTrace();
                    }
                    try {
                        if (choice > balance) {
                            throw new MyException("Insufficient Balance");
                        }
                    } catch (MyException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Enter denomination again: ");
                    choice = in.nextInt();
                    k = choice % 100;
                }
                balance -= choice;
                System.out.println("Balance in the Account: " + balance);
                break;
            case default:
                try {
                    throw new MyException("Invalid choice");
                } catch (InputMismatchException e) {
                    System.out.println(e);
                } catch (MyException e) {
                    e.printStackTrace();

                }
        }
    }
}

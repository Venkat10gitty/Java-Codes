package venkat;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int num1 = input.nextInt();
        System.out.print("Enter the number: ");
        int num1 = input.nextInt();
        //System.out.println(num1);
        System.out.println("The next number to the number you entered is: " + (num1+1));
    }
}

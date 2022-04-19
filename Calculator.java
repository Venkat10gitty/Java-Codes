package venkat;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                char operation;
        System.out.println("Choose one from the following \n A) Addition \n B) Subtraction \n C) Multiplication \n D) Division ");
        operation = input.next().charAt(0);


        int n1, n2;
        System.out.print("Enter 1st number: ");
        n1= input.nextInt();
        System.out.print("Enter 2nd number: ");
        n2= input.nextInt();
        if(operation == 'A' || operation == 'a'){
            System.out.println("After performing the operation, result is: " + (n1+n2));
        }else if(operation == 'B' || operation == 'b'){
            System.out.println("After performing the operation, result is: " + (n1-n2));
        }else if(operation == 'C' || operation == 'c')
            System.out.println("After performing the operation, result is: " + (n1 * n2));
        else if(operation == 'D' || operation == 'd')
            System.out.println("After performing the operation, result is: " + (n1 / n2));
    }
}

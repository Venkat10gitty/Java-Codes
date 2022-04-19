package venkat;

import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num;
        System.out.print("Enter the number: ");
        num = inp.nextInt();
        Reverse(num);
//        Scanner inp = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = inp.nextInt();
//
//        System.out.println("Reversal of number is : ");
//        while (n > 0) {
//            int rem;
//            rem = n % 10;
//            System.out.print(rem);
//            n = n / 10;
        }
        static void Reverse(int a) {
        while (a>0){
            int rem;
            rem = a%10;
            System.out.print(rem);
            a=a/10;
        }
    }
}


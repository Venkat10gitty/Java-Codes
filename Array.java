package venkat;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static int length;

    public static void main(String[] args) {
//        ArrayList<Integer> arr =  new ArrayList<Integer>();
//        Scanner in = new Scanner(System.in);
//
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(new ArrayList(i));
//        }
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for(int num : a){
            System.out.println(num);
        }
    }
}

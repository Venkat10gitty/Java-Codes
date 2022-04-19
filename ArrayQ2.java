package venkat;

import java.util.Scanner;

public class ArrayQ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Number of elements in the array: ");
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr[i];
        }
        System.out.println("New array is : ");
        for(int num: arr2){
            System.out.print(num + "");
        }
    }
}

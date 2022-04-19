package venkat;

import java.util.Scanner;

public class ArrayQ3 {
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
        EvenOdd(arr, n);
    }
    public static void EvenOdd(int[] array, int size) {
        int[] even = new int[size];
        int[] odd = new int[size];
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                even[i] = array[i];
            } else
                odd[i] = array[i];

            System.out.println("Even elements of the array are: ");
            for (i = 0; i < size; i++) {
                System.out.println(even[i]);
            }
            System.out.println("Odd elements of the array are: ");
            for (i = 0; i < size; i++) {
                System.out.println(odd[i]);
            }
        }
    }
}

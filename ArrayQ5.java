package venkat;

import java.util.Scanner;

public class ArrayQ5 {
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
        int max = arr[0];
        int min = arr[0];
        float sum = arr[0];
        for(int i = 1; i < n; i++)
        {
            sum  += arr[i];
            if(arr[i] > max)
                max = arr[i];
            else if(arr[i] < min)
                min = arr[i];
        }
        float x = ((sum-max-min) / (n - 2));
        System.out.printf("Average value of an array of integers except the largest and smallest values: %.2f",x);
        System.out.print("\n");
    }
}

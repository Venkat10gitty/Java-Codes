package venkat;
import java.util.Scanner;

public class ArrayQ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Number of elements in the array: ");
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        int avg;
        avg = sum/n;
        System.out.println("Average value of array elements is: " +avg);
    }
}

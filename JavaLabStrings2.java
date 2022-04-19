package venkat;
import java.util.Scanner;

public class JavaLabStrings2 {
        public static void main(String[] args) {
            Scanner b= new Scanner(System.in);
            int content,z;
            int ans=0;

            int[][] a =new int[4][];
            for(int i=0;i<4;i++)
            {
                System.out.print("Enter the number of slow learners in the batch "+(i+1)+": ");
                content=b.nextInt();

                if(content%4==0)
                    z=content/4;
                else
                    z=content/4+1;

                a[i]=new int[z];
                for(int j=0;j<z;j++) {
                    if(content>4) {
                        a[i][j]=4;
                        content=content-4;
                    } else {
                        a[i][j]=content;
                        content=0;
                    }
                }
            }
            System.out.println("Contents of 2D Jagged array are:-");
            for(int i=0;i<4;i++) {
                for(int n:a[i]) {
                    System.out.print(n);
                    if(n==4)
                        ans++;
                }
                System.out.println();
            }
            System.out.println("The number of Tutors with 4 students are: "+ans);
        }

    }

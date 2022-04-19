package venkat;
import java.io.*;
import java.util.*;
public class ThomasSirExp {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("testout.txt");
        DataOutputStream dos = new DataOutputStream(os);
        int itemNo; String itemName, ch; double unitPrice;
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.println("Enter the item number, name and unit price:");
            itemNo = in.nextInt();
            itemName = in.next();
            unitPrice = in.nextDouble();
            dos.writeInt(itemNo);
            dos.writeUTF(itemName);
            dos.writeDouble(unitPrice);
            System.out.println("Continue(y/n)?");
            ch = in.next();
        }while(ch.equals("yes"));
        dos.close();
    }
}

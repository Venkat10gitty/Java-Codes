package venkat;

import java.io.*;

public class Cat2Prac {
    public static void main(String[] args) throws IOException {
//        try {
//            FileOutputStream f = new FileOutputStream(new File("CAT2.txt"));
//            DataOutputStream oi = new DataOutputStream(f);
//            oi.writeUTF("Hello");
//            //oi.writeInt(1551);
//            oi.close();
//            f.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            FileInputStream i = new FileInputStream(new File("CAT2.txt"));
//            DataInputStream di = new DataInputStream(i);
////            int n = di.readInt();
//            String s = di.readUTF();
////            while(n!=-1) {
////                System.out.println(n);
////            }
//            while (s != null) {
//                System.out.println(s);
//            }
//            i.close();
//            di.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        FileReader f = new FileReader("Venky1.txt");
//        String s;
//        while((s= String.valueOf(f.read()))!=null) {
//            System.out.println(s);
//        }
        int n;
        while((n = f.read())!= -1) {
            System.out.println(n);
        }
    }
}

package venkat;
import java.io.*;

public class FileIO {
    public static void main(String[] args) {
       try {
//            FileOutputStream f = new FileOutputStream(new File("Venky1.txt"));
//            f.write(Integer.parseInt("Hello"));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
            BufferedWriter n = new BufferedWriter(new FileWriter("CAT2PRAC.txt"));
            n.write("Hello\nhi\nhru\nbye");
            n.write(String.valueOf(123));
            n.write("helloworld");
            n.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            BufferedReader n1 = new BufferedReader(new FileReader("Venky1.txt"));
            String s;
            //s = n1.readLine();
            while ((s=n1.readLine()) != null) {
                System.out.println(s);
            }
            n1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

package venkat;

public class Farhan {
    public static void main(String[] args) {
        test3();
    }

    private static void test3() {
        int i1;
        for (i1 = 0; i1 < 10; i1++) {
            System.out.println("d: " + getDensity(i1));
            int i2;
            for (i2 = 0; i2 < 10; i2++) {
                System.out.println("c: " + getCube(i2));
            }
        }
    }

    private static int getCube(int i2) {
        return i2 * i2;
    }

    private static int getDensity(int i1) {
        return i1;
    }

    public static void test2() {
        int i = 4;
        int i6 = 0;
        if (!(6 >= (i * i))) {
            i6 = i;
        }
        int i7 = i6+2;
    }
}
//    public static int test1() {
//        double i;
//        for (i = 0; i < 10; i++) {
//            if (Math.sqrt(i) > 2.5)
//                break;
//        }
//        return (int) i;
//    }


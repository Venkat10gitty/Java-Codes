package venkat;

class Ab extends Thread{
    public void run(){
        for (int i = 1; i<5; i++){
            System.out.println("\nFrom Thread 1 i ="+i);
        }
    }
}
class Bb implements Runnable {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\tFrom Thread 1 j =" + j);
        }
    }

    public void start() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\tFrom Thread 2 j =" + j);
        }
    }

    class Abcd {
        public static void main(String[] args) {
            Ab ThreadA = new Ab();
            ThreadA.start();
            Bb ThreadB = new Bb();
            ThreadB.start();
        }
    }
}





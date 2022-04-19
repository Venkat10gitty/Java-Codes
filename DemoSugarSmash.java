package venkat;
import java.util.Scanner;

public class DemoSugarSmash {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PremiumSugarSmashPlayer player = new PremiumSugarSmashPlayer();
        player.setVals(12, "venkat");
        System.out.println("Welcome " + player.getSname());
        String ch = "yes";
        while (ch.equals("yes")) {
            System.out.println("\nEnter level and score: ");
            int lev = in.nextInt();
            int sco = in.nextInt();
            player.setScore(lev, sco);
            System.out.print("Continue? ");
            ch = in.next();
            System.out.println("\nWant to pay $2.99 for premium membership? ");
            ch = in.next();
            if (ch.equals("no")) {
                System.out.println("Bye...");
            } else {
                System.out.println("\nUnlocking 40 extra levels...");
                player.unlock();
                System.out.println("You are premium player now!!");
            }
        }
    }
}

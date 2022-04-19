package venkat;

import java.util.Scanner;

public class PremiumSugarSmashPlayer extends SugarSmashPlayer {
    int[] additionalLevels;
    public void unlock(){
        additionalLevels = new int[40];
    }
    public void setAdditionalScore(int level, int score){
        if(level < 39){
            additionalLevels[level-9] = score;
        }
        else
            System.out.println("Enter valid levels only!!");
    }
}

//                while (ch.equals("yes")) {
//                    System.out.println("\nEnter level and score: ");
//                    int lev = in.nextInt();
//                    int sco = in.nextInt();
//                    player.setAdditional Score(lev, sco);
//                    System.out.print("Continue? ");
//                    ch = in.next();
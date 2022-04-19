package venkat;

//class TaxPlayer
//{
//
//    private  int SSN;
//    private  int income;
//    private String s1;
//
//    TaxPlayer()
//    {
//        SSN = 0;
//        income = 0;
//    }
//
//    TaxPlayer(int SSN , int income)
//    {
//
//        this.SSN = SSN;
//        this.income = income;
//    }
//
//    public int getSSN()
//    {
//
//        return this.SSN;
//    }
//    public int getIncome()
//    {
//        return this.income;
//    }
//    TaxPlayer getDetails()
//    {
//        Scanner sc = new Scanner(System.in);
//        SSN = sc.nextInt();
//
//        income = sc.nextInt();
//        return null;
//    }
////    public String toString()
////    {
////        return "SSN is " + getSSN() + " income is " + getIncome();
////        //        int num1, num2;
//////        num1 = getSSN();
//////        num2 = getIncome();
//////        System.out.println("SSN is" +  num1 + " income is " + num2);
//////        return null;
////    }
//    public boolean print(){
//        int num1, num2;
//        num1 = getSSN();
//        num2 = getIncome();
//        System.out.println("SSN is" +  num1 + " income is " + num2);
//        return false;
//    }
//}
//class UseTaxPlayer
//{
//    public static void main(String[] args)
//    {
//        TaxPlayer[] tp = new TaxPlayer[10];
//
//        for (int i = 0; i < 10; i++) {
//            tp[i] = new TaxPlayer();
//        }
//            for (int i = 0; i < tp.length; i++) {
//                tp[i] = tp[i].getDetails();
//                System.out.println(tp[i].print());
//            }
//
//
//
//    }
//}
//
//class TaxPlayer
//{
//
//    int SSN;
//    int income;
//
//    TaxPlayer()
//    {
//        SSN = 0;
//        income = 0;
//    }
//
//    TaxPlayer(int SSN , int income)
//    {
//
//        this.SSN = SSN;
//        this.income = income;
//    }
//
//    public int getSSN()
//    {
//
//        return SSN;
//    }
//    public int getincome()
//    {
//        return income;
//    }
//
//
//}
//class UseTaxPlayer
//{
//    public static void main(String[] args)
//    {
////int SSN ;
////int income;
///*TaxPlayer[] tp = new TaxPlayer[10];
//
//Scanner sc = new Scanner(System.in);
//
//for (int i=0;i<10; i++)
//{
//
////tp[i].SSN = sc.nextInt();
////tp[i].income =sc.nextInt();
//System.out.println(" SSN of person" + (i+1) + " is " + tp[i].SSN + " and yearly gross income is " + tp[i].income);
//}
//*/
//        for (int i=0;i<10;i++)
//        {
//            TaxPlayer tp = new TaxPlayer();
//
//            Scanner sc = new Scanner(System.in);
//            tp.SSN = sc.nextInt();
//            tp.income =sc.nextInt();
//            System.out.println(" SSN of person" +  " is " + tp.SSN + " and yearly gross income is " + tp.income);
//        }
//    }
//}
//
public class SugarSmashPlayer {
    int pid;
    String sname;
    int[] scores;

    public SugarSmashPlayer() {
        scores = new int[9];
    }

    public int getPid() {
        return pid;
    }

    public String getSname() {
        return sname;
    }

    public int getScore(int level) {
        return scores[level - 1];
    }

    public void setVals(int pid, String sname) {
        this.pid = pid;
        this.sname = sname;
    }

    public void setScore(int level, int score) {
        if (level < 9) {
            if (scores[level - 1] >= 100 || level == 1)
                scores[level] = score;
            else
                System.out.println("Pass previous level first!!!");
        } else
            System.out.println("Enter valid level!!!");
    }
}

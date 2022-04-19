package venkat;
import java.util.Scanner;

class Date_Class
{

    private int day;
    private String month;
    private int year;
    private String time;




    Date_Class()
    {
        day = 0;
        month = null;
        time = null;

    }

    public int getday()
    {
        return day;
    }

    public String getmonth()
    {
        return month;
    }

    public int getyear()
    {
        return year;
    }

    public String gettime()
    {
        return time ;

    }


    public void setday(int day)
    {
        this.day = day;
    }
    public void setmonth(String month)
    {
        this.month = month;
    }
    public void setyear(int year)
    {
        this.year = year;
    }
    public void settime(String time)
    {
        this.time = time;

    }

    public String toString()
    {
        String str = getday() + " / " + getmonth() + "/" + getyear() + "/" + gettime();
        return str;
    }
}
class TestDate_Class
{
    public static void main(String[] args)
    {
        Date_Class d = new Date_Class();
        Scanner sc = new Scanner(System.in);

//        String time = sc.nextLine();
//        String month = sc.next();
//        int day = sc.nextInt();
//        int year = sc.nextInt();
        int day = sc.nextInt();
        String month = sc.next();
        int year = sc.nextInt();

        String junk = sc.nextLine();

        String time = sc.nextLine();


        d.setday(day);
        d.setmonth(month);
        d.setyear(year);
        d.settime(time);

       System.out.println(d.toString());
    }
}
package venkat;
//
//import java.util.Objects;
//import java.util.Scanner;
//
//
//
//
//public class Date_class {
//    int date;
//    private int year;
//    private int time_hour;
//    private int time_min;
//    private int time_sec;
//    private String month;
//
//    static class abc extends Date_class{
//        int n=10;
//    }
//
//     Date_class(int date, int year, int time_hour) {
//        this.date = date;
//        this.year = year;
//        this.time_hour = time_hour;
//    }
//
//     Date_class(int date, int year, String month, int time_hour, int time_min, int time_sec) {
//        this.date = date;
//        this.month = month;
//        this.year = year;
//        this.time_hour = time_hour;
//        this.time_min = time_min;
//        this.time_sec = time_sec;
//
//    }
//
//     Date_class() {
//        date = 0;
//        year = 0;
//        month = null;
//        time_min = 0;
//        time_hour = 0;
//        time_sec = 0;
//    }
//
//    void get(){
//        Scanner in = new Scanner(System.in);
//        this.month = in.nextLine();
//        this.date = in.nextInt();
//        this.year = in.nextInt();
//        this.time_hour = in.nextInt();
//        this.time_min = in.nextInt();
//        this.time_sec = in.nextInt();
//    }
//
//    void set(){
//        Scanner in = new Scanner(System.in);
//        if(Objects.equals(this.month, "february")){
//            if(this.date>28){
//                System.out.println("Date format is incorrect");
//                this.date= in.nextInt();
//            }
//        }
//    }
//    void DisplayDate(){
//        System.out.println(this.month +"/" + this.date +"/" + this.year + "/" + this.time_hour + ":" + this.time_min + ":" + this.time_sec );
//    }
//
//    public static void main(String[] args) {
//        Date_class one = new Date_class();
//        one.get();
//        one.set();
//        one.DisplayDate();
//    }
//}

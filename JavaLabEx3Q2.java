package venkat;

import java.util.Scanner;
class Student {
    int rollNum, hostelNum, roomNum, birthdate;
    String firstName,lastName,wing, course;

    Student() {
        rollNum = 0;
        hostelNum=0;
        roomNum=0;
        birthdate=0;
        firstName=null;
        lastName=null;
        wing=null;
        course=null;
    }

    public Student(int rollNum, String firstName, String course) {
        this.rollNum = rollNum;
        this.firstName = firstName;
        this.course = course;
    }
    public void get() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student name: ");
        firstName = in.nextLine();
        lastName = in.nextLine();
        System.out.println("Enter the course & wing");
        course = in.nextLine();
        wing = in.nextLine();
        System.out.println("Enter rollNum, hostelNum, roomNum & birthdate");
        rollNum = in.nextInt();
        hostelNum = in.nextInt();
        roomNum= in.nextInt();
        birthdate = in.nextInt();
    }
    public  void update() {
        Scanner in = new Scanner(System.in);
        System.out.println("Update roomNo: ");
        roomNum= in.nextInt();
    }
    public void display() {
        System.out.println("Displaying Student details  :: ");
        System.out.println("Name:" +firstName + " " + lastName +  "Room No: " +"\n" + roomNum +"\n" + "Roll No: " + rollNum +"\n" +"Birthdate: "+ birthdate +"\n" + "hostelNum: " + hostelNum +"\n" +"Course: " + course +"\n" +"Wing: " + wing);
    }
}
public class JavaLabEx3Q2 {
    public static void main(String[] args) {
        Student venkat = new Student();
        venkat.get();
        venkat.display();
    }
}

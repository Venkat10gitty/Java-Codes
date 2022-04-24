//package com.venkat;
//
//import com.venkat.Student.Result;
//import java.util.Scanner;
//abstract class Student {
//    static int Rollno;
//    static int subject_1_mark;
//    static String  Name;
//    abstract void Show_student_data();
//
//    void Get_student_data() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter name: ");
//        Name = in.nextLine();
//        System.out.println("Enter your age: ");
//        Rollno = in.nextInt();
//        System.out.println("Enter your Roll number: ");
//        subject_1_mark = in.nextInt();
//    }
//
//    interface Sport {
//        int sport_grace_marks = 5;
//
//        static void Show_sport_mark() {
//            System.out.println(sport_grace_marks);
//        }
//    }
//
//    interface NCC {
//        int NCC_grace_marks = 10;
//
//        static void Show_sport_mark() {
//            System.out.println(NCC_grace_marks);
//        }
//    }
////
////    static class Result implements Sport, NCC extends Student{
////        static void Show_result() {
////            System.out.println(sport_grace_marks + NCC_grace_marks + subject_1_mark);
////        }
////    }
////}
////public class Lab6_Q2 {
////    Student venkat = new Result();
////        void Show_student_data() {
////            System.out.println("Student name is: " + Student.Name);
////            System.out.println("Student Roll Number is: " + Student.Rollno);
////            System.out.println("Student marks in Subject2 is: " + Student.subject_1_mark);
////        }
////    }

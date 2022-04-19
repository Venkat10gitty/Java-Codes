package venkat;

import java.util.Scanner;

public class Anjali_Assignment {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:- \n1. Arithmetic\n2. Logarithmic\n3. Trigonometry\n4.Converter\n --Enter your registration number to exit the program--\nYour choice:");
            int input = in.nextInt();
            if (input == 1 || input == 2 || input == 3 || input == 4) {
                if(input == 1){
                Arithmetic();
                }
                if (input == 2){
                    Logarithmic();
                }
                if(input == 3){
                    Trigonometry();
                }
                if (input == 4) {
                    Converter();
                }
            } else if (input == 1419){
                System.out.println("Exiting the program!");
                break;
            } else {
                System.out.println("Invalid input!!");
                break;
            }
        }
    }
    private static void Converter() {
        System.out.println("\nSub Menu:- \n1. Miles to Kilometers\n2. Kilometers to Miles\n3. Celsius to Fahrenheit\n4. Fahrenheit to Celsius\nYour choice:");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        switch (input) {
            case 1:
                Miles2kilo();
                break;
            case 2:
                Kilo2miles();
                break;
            case 3:
                CeltoFar();
                break;
            case 4:
                FartoCel();
                break;
        }
    }
    private static void Miles2kilo() {
        double miles;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter miles:");
        miles = in.nextDouble();
        double kilometers = miles * 1.6;
        System.out.println(kilometers + " Kilometers");
    }
    private static void Kilo2miles() {
        double kilometers;
        System.out.println("Please enter kilometers:");
        Scanner in = new Scanner(System.in);
        kilometers = in.nextDouble();
        double miles = kilometers / 1.6;
        System.out.println(miles + " Miles");
    }
    private static void CeltoFar() {
        float cel, far;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter temp. in Celsius :");
        cel=s.nextInt();
        far = cel * 9/5 + 32;
        System.out.println("Temp. in Fahrenheit: "+far);
    }
    private static void FartoCel() {
        float cel, far;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter temp. in Fahrenheit :");
        far=s.nextInt();
        cel = (far - 32) * 5/9;
        System.out.println("Temp. in Celsius: "+cel);
    }
    public static void Arithmetic() {
        System.out.println("\nSub Menu:- \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\nYour choice:");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        switch (input) {
            case 1:
                Add();
                break;
            case 2:
                Sub();
                break;
            case 3:
                Multi();
                break;
            case 4:
                Div();
                break;
        }
    }
    private static void Div() {
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        System.out.println("Result is: " +(num1/num2));
    }
    private static void Multi() {
        System.out.println("Enter first and second number:");
        Scanner in= new Scanner(System.in);
        int num1,num2;
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println("Result is: " +(num1*num2));
    }
    private static void Sub() {
        System.out.println("Enter first and second number:");
        Scanner in= new Scanner(System.in);
        int num1,num2;
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println("Result is: " +(num1-num2));
    }
    private static void Add() {
        System.out.println("Enter first and second number:");
        Scanner in= new Scanner(System.in);
        int num1,num2;
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println("Result is: " +(num1+num2));
    }

    public static void Logarithmic(){
        System.out.println("\nSub Menu:- \n1. Logarithmic Addition\n2. Logarithmic Subtraction\n3. Logarithmic Multiplication\n4. Logarithmic Division\nYour choice:");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        switch (input) {
            case 1:
                LogAdd();
                break;
            case 2:
                LogSub();
                break;
            case 3:
                LogMulti();
                break;
            case 4:
                LogDiv();
                break;
        }
    }
    private static void LogAdd() {
        System.out.println("Enter first and second number:");
        Scanner in= new Scanner(System.in);
        int num1,num2;
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println(Math.log(num1)+Math.log(num2));
    }
    private static void LogSub() {
        System.out.println("Enter first and second number:");
        Scanner in= new Scanner(System.in);
        int num1,num2;
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println(Math.log(num1)-Math.log(num2));
    }
    private static void LogMulti() {
        System.out.println("Enter first and second number:");
        Scanner in= new Scanner(System.in);
        int num1,num2;
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println(Math.log(num1)*Math.log(num2));
    }
    private static void LogDiv() {
        System.out.println("Enter first and second number:");
        Scanner in= new Scanner(System.in);
        int num1,num2;
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println(Math.log(num1)/Math.log(num2));
    }
    public static void Trigonometry(){
        Scanner in = new Scanner(System.in);

        System.out.print("\nSub Menu:-\n1. Radian\n2. degree mode\n\nYour choice: ");
        int choice = in.nextInt();

        if(choice==2){
            System.out.print("\nWhich operation?\n1. Sin\n2. Cos\n3. Tan\n\nYour choice:");
            int operation = in.nextInt();
            switch (operation) {
                case 1:
                    System.out.print("Number to be evaluated in sin function: ");
                    System.out.println(Math.sin(Math.toRadians(in.nextInt())));
                    break;
                case 2:
                    System.out.print("Number to be evaluated in cos function: ");
                    System.out.println(Math.cos(Math.toRadians(in.nextInt())));
                    break;
                case 3:
                    System.out.print("Number to be evaluated in tan function: ");
                    System.out.println(Math.tan(Math.toRadians(in.nextInt())));
                    break;
                default:
                    break;
            }
        } else{
            System.out.print("\nWhich operation?\n1. Sin\n2. Cos\n3. Tan\n\nYour choice:");
            int operation = in.nextInt();
            switch (operation) {
                case 1:
                    System.out.print("Number to be evaluated in sin function: ");
                    System.out.println(Math.sin(in.nextInt()));
                    break;
                case 2:
                    System.out.print("Number to be evaluated in cos function: ");
                    System.out.println(Math.cos(in.nextInt()));
                    break;
                case 3:
                    System.out.print("Number to be evaluated in tan function: ");
                    System.out.println(Math.tan(in.nextInt()));
                    break;
                default:
                    break;
            }
        }
    }
}




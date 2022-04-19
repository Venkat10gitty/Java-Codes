package venkat;

import java.util.Objects;
import java.util.Scanner;

public class Jay_calculator {
        public static void main(String[] args) {
            System.out.println("Menu: ");
            System.out.println("1. Arithmetic");
            System.out.println("2. Logarithmic");
            System.out.println("3. Trigonometry");
            System.out.println("4. Converter");
            System.out.println("Your choice:");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input == 1 || input == 2 || input == 3 || input == 4) {
                if (input == 1) {
                    Arithmetic();
                }
                if (input == 2) {
                    Logarithmic();
                }
                if (input == 3) {
                    Trigonometry();
                }
                if (input == 4) {
                    Converter();
                }
            } else {
                System.out.println("Invalid input!!");
            }

        }

        private static void meterToKm() {
            System.out.println("Enter the number:");
            Scanner sc = new Scanner(System.in);
            int num1;
            num1 = sc.nextInt();

            System.out.println("Result is: " + (num1 / 1000));
            int reg = sc.nextInt();
            if (reg == 1419) {
                System.out.println("Exiting");
            }
        }

        private static void kmToMeter() {
            System.out.println("Enter the number:");
            Scanner sc = new Scanner(System.in);
            int num1;
            num1 = sc.nextInt();
            String junk = sc.nextLine();
            System.out.println("Result is: " + (num1 * 1000));

            String regd = sc.next();
            if (Objects.equals(regd, "20BCE1419")) {
                System.out.println("Exiting");
            }
        }

        public static void minToSec() {
            int min, sec;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Minutes");
            min = sc.nextInt();
            sec = min * 60;
            System.out.println("Seconds: " + sec);
            String junk = sc.nextLine();
            String regd = sc.next();
            if (Objects.equals(regd, "20BCE1419")) {
                System.out.println("Exiting");
            }
        }

        public static void secToMin() {
            int min, sec;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Seconds");
            min = sc.nextInt();
            sec = min / 60;
            System.out.println("Seconds: " + sec);
            String junk = sc.nextLine();
            String regd = sc.next();
            if (Objects.equals(regd, "20BCE1419")) {
                System.out.println("Exiting");
            }
        }

        private static void Converter() {

            System.out.println("Menu:-");
            System.out.println("1. Meter to Km");
            System.out.println("2. Km to Meter");
            System.out.println("3. Minute to Second");
            System.out.println("4. Second to Minute");
            System.out.println("Your choice:");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    meterToKm();
                    break;
                case 2:
                    kmToMeter();
                    break;
                case 3:
                    minToSec();
                    break;
                case 4:
                    secToMin();
                    break;
            }
        }

        public static void Arithmetic() {
            System.out.println("Sub Menu:- ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("Your choice:");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            String junk = sc.nextLine();
            switch (input) {
                case 1:
                    Addition();
//                    String regd = sc.next();
//                    if (Objects.equals(regd, "20BCE1419")) {
//                        System.out.println("Exiting");
//                    }
                    break;
                case 2:
                    Subtraction();
                    break;
                case 3:
                    Multiplication();
                    break;
                case 4:
                    Division();
                    break;
            }
        }

        private static void Addition() {
            System.out.println("Enter two numbers:");
            Scanner sc = new Scanner(System.in);
            int num1, num2;
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("Result is: " + (num1 + num2));
            String junk = sc.nextLine();
            String regd = sc.next();
            if (Objects.equals(regd, "20BCE1419")) {
                System.out.println("Exiting");
            }
        }

        private static void Subtraction() {
            System.out.println("Enter two numbers:");
            Scanner sc = new Scanner(System.in);
            int num1, num2;
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("Result is: " + (num1 - num2));
            String junk = sc.nextLine();
            String regd = sc.next();
            if (Objects.equals(regd, "20BCE1419")) {
                System.out.println("Exiting");
            }
        }

        private static void Multiplication() {
            System.out.println("Enter two numbers:");
            Scanner sc = new Scanner(System.in);
            int num1, num2;
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("Result is: " + (num1 * num2));
            String junk = sc.nextLine();
            String regd = sc.next();
            if (Objects.equals(regd, "20BCE1419")) {
                System.out.println("Exiting");
            }
        }

        private static void Division() {
            System.out.println("Enter two numbers:");
            Scanner sc = new Scanner(System.in);
            int num1, num2;
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("Result is: " + (num1 / num2));
            String junk = sc.nextLine();
            String regd = sc.next();
            if (Objects.equals(regd, "20BCE1419")) {
                System.out.println("Exiting");
            }
        }

        public static void Logarithmic() {
            System.out.println("Sub Menu: ");
            System.out.println("1. Logarithmic Addition");
            System.out.println("2. Logarithmic Subtraction");
            System.out.println("3. Logarithmic Multiplication");
            System.out.println("4. Logarithmic Division");
            System.out.println("Your choice:");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    LogAddition();
                    break;
                case 2:
                    LogSubtraction();
                    break;
                case 3:
                    LogMultiplication();
                    break;
                case 4:
                    LogDivision();
                    break;
            }
        }

        private static void LogAddition() {
            System.out.println("Enter two numbers:");
            Scanner sc = new Scanner(System.in);
            int num1, num2;
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println(Math.log(num1) + Math.log(num2));
            String junk = sc.nextLine();
            String regd = sc.next();
            if (Objects.equals(regd, "20BCE1419")) {
                System.out.println("Exiting");
            }
        }

        private static void LogSubtraction() {
            System.out.println("Enter two numbers:");
            Scanner sc = new Scanner(System.in);
            int num1, num2;
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println(Math.log(num1) - Math.log(num2));
            String junk = sc.nextLine();
            String regd = sc.next();
            if (Objects.equals(regd, "20BCE1419")) {
                System.out.println("Exiting");
            }
        }

        private static void LogMultiplication() {
            System.out.println("Enter two numbers:");
            Scanner sc = new Scanner(System.in);
            int num1, num2;
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println(Math.log(num1) * Math.log(num2));
            String junk = sc.nextLine();
            String regd = sc.next();
            if (Objects.equals(regd, "20BCE1419")) {
                System.out.println("Exiting");
            }
        }

        private static void LogDivision() {
            System.out.println("Enter two numbers:");
            Scanner sc = new Scanner(System.in);
            int num1, num2;
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println(Math.log(num1) / Math.log(num2));
            String junk = sc.nextLine();
            String regd = sc.next();
            if (Objects.equals(regd, "20BCE1419")) {
                System.out.println("Exiting");
            }
        }

        public static void Trigonometry() {
            Scanner sc = new Scanner(System.in);

            System.out.print("\nSub Menu:-\n1. Radian\n2. degree mode\n\nYour choice: ");
            int choice = sc.nextInt();

            if (choice == 2) {
                System.out.print("\nWhich operation?\n1. Sin\n2. Cos\n3. Tan\n\nYour choice:");
                int operation = sc.nextInt();
                String regd, junk;
                switch (operation) {
                    case 1:
                        System.out.print("Number to be evaluated in sin function: ");
                        System.out.println(Math.sin(Math.toRadians(sc.nextInt())));
                        junk = sc.nextLine();
                        regd = sc.next();
                        if (Objects.equals(regd, "20BCE1419")) {
                            System.out.println("Exiting");
                        }
                        break;
                    case 2:
                        System.out.print("Number to be evaluated in cos function: ");
                        System.out.println(Math.cos(Math.toRadians(sc.nextInt())));
                        junk = sc.nextLine();
                        regd = sc.next();
                        if (Objects.equals(regd, "20BCE1419")) {
                            System.out.println("Exiting");
                        }
                        break;
                    case 3:
                        System.out.print("Number to be evaluated in tan function: ");
                        System.out.println(Math.tan(Math.toRadians(sc.nextInt())));
                        junk = sc.nextLine();
                        regd = sc.next();
                        if (Objects.equals(regd, "20BCE1419")) {
                            System.out.println("Exiting");
                        }
                        break;
                    default:
                        junk = sc.nextLine();
                        regd = sc.next();
                        if (Objects.equals(regd, "20BCE1419")) {
                            System.out.println("Exiting");
                        }
                        break;
                }
            } else {
                System.out.print("Which operation?");
                System.out.print("1. Sin");
                System.out.print("2. Cos");
                System.out.print("3. Tan");
                System.out.print("Your choice:");
                int operation = sc.nextInt();
                String regd, junk;
                switch (operation) {
                    case 1:
                        System.out.print("Number to be evaluated in sin function: ");
                        System.out.println(Math.sin(sc.nextInt()));
                        junk = sc.nextLine();
                        regd = sc.next();
                        if (Objects.equals(regd, "20BCE1419")) {
                            System.out.println("Exiting");
                        }
                        break;
                    case 2:
                        System.out.print("Number to be evaluated in cos function: ");
                        System.out.println(Math.cos(sc.nextInt()));
                        junk = sc.nextLine();
                        regd = sc.next();
                        if (Objects.equals(regd, "20BCE1419")) {
                            System.out.println("Exiting");
                        }
                        break;
                    case 3:
                        System.out.print("Number to be evaluated in tan function: ");
                        System.out.println(Math.tan(sc.nextInt()));
                        junk = sc.nextLine();
                        regd = sc.next();
                        if (Objects.equals(regd, "20BCE1419")) {
                            System.out.println("Exiting");
                        }
                        break;
                    default:
                        junk = sc.nextLine();
                        regd = sc.next();
                        if (Objects.equals(regd, "20BCE1419")) {
                            System.out.println("Exiting");
                        }
                        break;
                }
            }
        }
    }

package venkat;

import java.util.*;
class MyThread extends Thread
{
    public void run ()
    {
        String category;
        int grams;
        float price=0,wastage=0,amount=0,gst=0, netamount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter category: Earrings, Bracelet or Necklace:");
        category=sc.nextLine();

            System.out.println("Enter no of grams:");
            grams = sc.nextInt();
            System.out.println("Enter price per gram:");
            price = sc.nextFloat();
        try {
            if(grams <=0 || price <=0)

                    throw new Exception("Invalid Input");
                } catch (Exception e) {
                   System.out.println(e);
                }

        switch (category) {
            case "Earrings":
                amount = (float) price * grams;
                wastage = (float) 0.05f * amount;
                gst = (float) 0.03f * (amount + wastage);
                netamount = (float) amount + wastage + gst;
                break;
            case "Bracelet":
                amount = (float) price * grams;
                wastage = (float) 0.2f * amount;
                gst = (float) 0.03f * (amount + wastage);
                netamount = (float) amount + wastage + gst;
                break;
            case "Necklace":
                amount = (float) price * grams;
                wastage = (float) 0.14f * amount;
                gst = (float) 0.03f * (amount + wastage);
                netamount = (float) amount + wastage + gst;
                break;
            case null:
            case default:
                System.out.println("Invalid type");
                break;
        }
            System.out.println("Original amount:"+amount+"\nWastage="+wastage+"\nGST="+gst+"\nNet Amount="+netamount);
    }
}


class DA2Q2 {
    public static void  main (String[] args) {
        try {
            MyThread c1 = new MyThread();
            MyThread c2 = new MyThread();
            MyThread c3 = new MyThread();
            System.out.println("\nRunning Thread 1...\n");
            c1.start();
            c1.join();
            System.out.println("\nRunning Thread 2...\n");
            c2.start();
            c2.join();
            System.out.println("\nRunning Thread 3...\n");
            c3.start();
            c3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
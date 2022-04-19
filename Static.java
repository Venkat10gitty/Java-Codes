package venkat;
//
//import java.util.*;
//abstract class Animals{
//        protected int legs;
//        protected Animals(int Legs) {
//    this.legs = legs;
//    System.out.println("No. of legs: " + legs);
//}
//    abstract void eat(); void walks(int Legs){
//        System.out.println("can walk with " + legs + " legs");
//    }
//}
//        class spider extends Animals {
//            public spider() {
//                super(8);
//            }
//
//            void eat() {
//                System.out.println("Spiders eat ants");
//            }
//        }
//        interface pet {
//            void setname(String s);
//            String getname();
//            void play();
//        }
//        class cat extends Animals implements pet {
//            String name;
//
//            public cat(String s) {
//                super(4);
//                name = s;
//            }
//
//            public cat() {
//                super(4);
//                this.name = "";
//            }
//
//            public void setname(String s) {
//                name = s;
//            }
//
//            public String getname() {
//                return name;
//            }
//
//            public void play() {
//                System.out.println("You can play with cat");
//            }
//
//            void eat() {
//                System.out.println("Cat eats fish");
//            }
//        }
//class fish extends Animals {
//    public fish() {
//        super(0);
//    }
//
//    void eat() {
//        System.out.println("Fish eats fish");
//    }
//
//    public void walks() {
//        System.out.println("Fishes have no legs and can't walk");
//    }
//}
//public class TestAnimals {
//    public static void main(String[] args) {
//        System.out.println("Spider");
//        Animals a = new spider();
//        a.eat();
//        System.out.println("\nCat");
//        cat b = new cat("Kitty");
//        b.setname("Kitty");
//        b.getname();
//        b.play();
//        b.eat();
//        System.out.println("\nFish");
//        fish c = new fish();
//        c.walks();
//    }
//}
import java.util.Scanner;

abstract class Animal
{

    protected int legs;

    protected Animal(int legs)
    {

        this.legs = legs;
    }

    public void walk()
    {
        System.out.println(" Walks on " + legs + " leg");
    }

    public abstract void eat();
}



class Spider extends Animal
{
    int legs;
    Spider()
    {
        super(8);

    }
    public void eat()
    {
        System.out.println(" Spiders eat insects ");

    }
}
interface Pet
{
    public String getName();

    public void setName(String name);

    public void play();
}

class Cat extends Animal implements Pet
{
    private String name;


    Cat (String name)
    {
        super(4);
        this.name = name;


    }

    Cat()
    {
        this("");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name ;
    }

    public void play()
    {
        System.out.println(" Cats like to play ");
    }

    public void eat()
    {
        System.out.println(" Cats like to eat non-veg food ");
    }





}

class Fish extends Animal implements Pet
{
    private String name;
    Fish()
    {
        super(0);

    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;

    }

    public void play()
    {
        System.out.println(" The fish can't play ");
    }



    public void walk()
    {
        System.out.println(" The fish can't walk and doesn't have legs ");
    }

    public void eat()
    {
        System.out.println(" The fish eats worms ");
    }











}



public class Static
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Fish d = new Fish();

        d.setName(name);

        System.out.println("The name of the fish is " + d.getName());
        d.walk();
        d.play();
        d.eat();


        Cat c = new Cat("Fluffy");
        c.setName("Fluffy");
        System.out.println("\n\nThe name of the cat is " + c.getName());
        c.play();
        c.eat();



        System.out.println("");
        Animal a = new Fish();
        a.walk();
        a.eat();



        System.out.println("");
        Animal e = new Spider();
        e.eat();
        e.walk();



        System.out.println("");
        name = sc.next();
        Pet p = new Cat();

        p.setName(name);
        System.out.println("The name of cat is " + p.getName());
        p.play();




    }
}
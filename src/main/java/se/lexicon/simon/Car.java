package se.lexicon.simon;

public class Car {


    static int counter = 0;

    //Instance fields or members.
    int id = 0;
    String name;
    String brand;
    String reg_number;


    public Car(){
        this.id = ++counter;
    }

    public static void staticMethod(){
    }

    public void notAStaticMethod(){
    }

    public static int getCounter(){
        return counter;
    }

    public int getId(){
        return this.id;
    }




}

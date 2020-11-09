package se.lexicon.simon.model;

/**
 * A General Structure of a class in order.
 * Fields, Constructors, Your Custom methods, Generated code like Getters, Setters, Equals, HashCodes and ToString
 */
public class Person {

    //Field
    private String firstName;
    private String lastName;
    private int age;
    private boolean sleeping;

    //Constructors - For instantiating objects

    //All-args Constructor - Initializing all fields in the class.
    public Person(String firstName, String lastName, int age, boolean sleeping){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sleeping = sleeping;
    }



    //Constructor
    public Person (String firstName, String lastName){
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //No-args Constructor - Initializing NO or setting a default value fields in the class
    public Person(){

        //My Initial values
        this.firstName = "UNKNOWN FIRSTNAME";
        this.lastName = "UNKNOWN LASTNAME";
        this.age = 255;
        this.sleeping = true;
    }



    //Your custom methods


    //Getters and Setters
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean isSleeping(){
        return sleeping;
    }

    public void setSleeping(boolean sleeping){
        this.sleeping = sleeping;
    }

    //Equals

    //HashCodes

    //toString

    public String getDescription(){
        return "firstName: " + this.firstName + " lastName: " + this.lastName + " age: " + this.age + " sleeping: " + this.sleeping;
    }

}

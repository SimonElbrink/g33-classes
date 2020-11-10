package se.lexicon.simon;

import se.lexicon.simon.model.Person;


public class App 
{
    public static void main( String[] args )
    {

        //Access method in a static way
        Car.staticMethod();
        //Car.counter = 15;


        //Access method in a NON-static way
        Car object1 = new Car();
        object1.notAStaticMethod();

        object1.name = "Miles";
        object1.brand = "Volvo";

        System.out.println("object1.getId() = " + object1.getId());

        System.out.println("Car.getCounter() = " + Car.getCounter());

        new Car();
        new Car();
        new Car();
        System.out.println("Car.getCounter() = " + Car.getCounter());
        new Car();
        new Car();


        // What id?  =  7
        Car object2 = new Car();
        System.out.println("object2.getId() = " + object2.getId());
        System.out.println("Car.getCounter()= " + Car.getCounter());
        
        object2.brand = "BMW";

        System.out.println("object1.brand = " + object1.brand);

        System.out.println("object2.brand = " + object2.brand);




        Person objectName = new Person("Simon", "Elbrink",23, false);
        Person objectName1 = new Person("Simon", "Elbrink",23, false);
        Person objectName2 = new Person("Simon", "Elbrink",23, false);


        objectName.setFirstName("Simon");
        objectName.setLastName("Elbrink");
        objectName.setAge(23);
        objectName.setSleeping(true);




        System.out.println("objectName.getDescription() = " + objectName.getDescription());


        Person person1 = new Person();
        System.out.println("Memory address = " + person1);

        System.out.println("firstName = " + person1.getFirstName());

        System.out.println("person1.getDescription() = " + person1.getDescription());


        Person person2 = new Person("Ulf", "Bengtsson");

        System.out.println("person2.getDescription() = " + person2.getDescription());


        //Not allowed!
       // objectName.firstName = "Simon";

    }
}

package se.lexicon.simon;

import se.lexicon.simon.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person objectName = new Person("Simon", "Elbrink",23, false);

/*
        objectName.setFirstName("Simon");
        objectName.setLastName("Elbrink");
        objectName.setAge(23);
        objectName.setSleeping(true);
*/


        System.out.println("objectName.getDescription() = " + objectName.getDescription());


        Person person1 = new Person();
/*
        System.out.println("Memory address = " + person1);

        System.out.println("firstName = " + person1.getFirstName());
*/

        System.out.println("person1.getDescription() = " + person1.getDescription());


        Person person2 = new Person("Ulf", "Bengtsson");

        System.out.println("person2.getDescription() = " + person2.getDescription());


        //Not allowed!
       // objectName.firstName = "Simon";






    }
}

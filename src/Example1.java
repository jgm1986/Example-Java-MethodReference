import common.Person;
import common.PersonFactory;

import java.util.List;
import java.util.function.Consumer;

public class Example1 {

    /**
     * This example explain how to use:
     * - Static Method Reference
     * <p>
     * Consumer interface (object) -> public void accept(Object)
     * Accept method has Object as input and has acept method which works on the object.
     * Does not return anything.
     */
    public static void main(String[] args) {
        List<Person> persons = PersonFactory.createPersons();

        /**
         * We want print the persons list
         */
        persons.forEach(new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println(person);
            }
        });
        printSplitLine();

        /**
         * Reference to the static method
         */
        persons.forEach(person -> Example1.printPerson(person));
        printSplitLine();

        /**
         * Same behaviour than the previous line but with less code
         */
        persons.forEach(Example1::printPerson);
        printSplitLine();
    }

    public static void printPerson(Person person) {
        System.out.println(person);
    }

    public static final void printSplitLine() {
        System.out.println("-------------------------------------------------------------------------------------");
    }
}

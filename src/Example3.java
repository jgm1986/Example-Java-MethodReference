import common.Person;
import common.PersonFactory;

import java.util.List;

public class Example3 {
    /**
     * This example explain how to use:
     * - Instance Method Reference
     * <p>
     * Accept method has Object as input and has accept method which works on the object
     * Does not return anything
     */
    public static void main(String[] args) {
        Example3 example3 = new Example3();
        List<Person> persons = PersonFactory.createPersons();
        persons.forEach(example3::printPerson);
        printSplitLine();

        // Another way
        persons.forEach(System.out::println);


    }

    public void printPerson(Person person) {
        System.out.println(person);
    }

    public static final void printSplitLine() {
        System.out.println("-------------------------------------------------------------------------------------");
    }
}

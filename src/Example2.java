import common.User;

import java.util.function.Supplier;

public class Example2 {
    /**
     * This example explain how to use:
     * - Static Method Reference
     * <p>
     * Supplier interface represented as () -> Method name
     * Does not take any input
     * Returns the object when get() method is invoked
     */
    public static void main(String[] args) {
        // Crates a supplier object
        Supplier<User> userSupplier1 = () -> Example2.createUser();
        System.out.println(userSupplier1.get());
        printSplitLine();

        // Other way to create a supplier object
        Supplier<User> userSupplier2 = Example2::createUser;
        System.out.println(userSupplier2.get());
        printSplitLine();


    }

    public static User createUser() {
        return new User(1, "jgusmar");
    }

    public static final void printSplitLine() {
        System.out.println("-------------------------------------------------------------------------------------");
    }
}

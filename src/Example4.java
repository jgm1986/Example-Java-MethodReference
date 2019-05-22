import common.User;

import java.util.function.Supplier;

public class Example4 {
    /**
     * This example explain how to use:
     * - Instance Method Reference
     * <p>
     * Supplier interface represented as () -> Method name
     * Does not take any input
     * Returns the object when get() method is invoked
     */
    public static void main(String[] args) {
        // Crates a supplier object
        Example4 example4 = new Example4();
        Supplier<User> userSupplier = example4::createUser;
        System.out.println(userSupplier.get());
        printSplitLine();


    }

    public User createUser() {
        return new User(1, "jgusmar");
    }

    public static final void printSplitLine() {
        System.out.println("-------------------------------------------------------------------------------------");
    }
}

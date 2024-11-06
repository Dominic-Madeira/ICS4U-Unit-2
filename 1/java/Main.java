/*
 * The Starting point for the script.
 *
 * @author Dominic M.
 * @since 2024-10-22
 * @version 1.0
 */

/**
 * This is the Main class.
 */
final class Main {

    /**
     * Prevent instantiation.
     *
     * @throws IllegalStateException if this is ever called
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This is the main function.
     *
     * @param args no args used
     */
    public static void main(final String[] args) {
        final fruitStack = new MrCoxallStack();
        fruitStack.pushString("apple");
        fruitStack.pushString("banana");
        fruitStack.pushString("cherry");
        System.out.println("Fruit items: " + fruitStack.showStack())
    }
}

/*
 * The Starting point for the script.
 *
 * @author Dominic M.
 * @since 2024-10-22
 * @version 1.0
 */

/**
 * This is the Fruits class.
 */
final class Fruits {

    /**
     * Prevent instantiation.
     *
     * @throws IllegalStateException if this is ever called
     *
     */
    private Fruits() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This is the main function.
     *
     * @param args no args used
     */
    public static void main(final String[] args) {

        // Use MrCoxallStack class
        final MrCoxallStack fruitStack = new MrCoxallStack();
        fruitStack.pushString("apple");
        fruitStack.pushString("banana");
        fruitStack.pushString("cherry");
        System.out.println("Fruit items: " + fruitStack.getStack());
        System.out.println("The stack's size is: " + fruitStack.getSize());
        System.out.println(
            "Is the stack empty? " + String.valueOf(fruitStack.getEmpty())
        );
        System.out.println("Popped fruit item: " + fruitStack.popItem());
        System.out.println("Fruit items: " + fruitStack.getStack());
        System.out.println("The stack's size is: " + fruitStack.getSize());
        System.out.println(
            "Is the stack empty? " + String.valueOf(fruitStack.getEmpty())
        );
        System.out.println("Top fruit is: " + fruitStack.peekItem());
        System.out.println("The stack's size is: " + fruitStack.getSize());
        System.out.println("Emptying stack...");
        fruitStack.clearStack();
        System.out.println("Fruit items: " + fruitStack.getStack());
        System.out.println("The stack's size is: " + fruitStack.getSize());
        System.out.println(
            "Is the stack empty? " + String.valueOf(fruitStack.getEmpty())
        );

        System.out.println("\nDone.");
    }
}

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
        // Use MrCoxallStack
        final MrCoxallStack fruitStack = new MrCoxallStack();
        fruitStack.pushString("apple");
        fruitStack.pushString("banana");
        fruitStack.pushString("cherry");
        System.out.println("Fruit items: " + fruitStack.showStack());

        final MrCoxallStack colorStack = new MrCoxallStack();
        colorStack.pushString("red");
        colorStack.pushString("green");
        colorStack.pushString("blue");
        System.out.println("Color items: " + colorStack.showStack());

        final MrCoxallStack doggyPile = new MrCoxallStack();
        doggyPile.pushString("poodle");
        doggyPile.pushString("retriever");
        doggyPile.pushString("beagle");
        System.out.println("Dog items: " + doggyPile.showStack());

        System.out.println("\nDone.");
    }
}

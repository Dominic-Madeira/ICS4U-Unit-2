/*
 * The Starting point for the script.
 *
 * @author Dominic M.
 * @since 2024-10-22
 * @version 1.0
 */

/**
 * This is the Dogs class.
 */
final class Dogs {

    /**
     * Prevent instantiation.
     *
     * @throws IllegalStateException if this is ever called
     *
     */
    private Dogs() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This is the main function.
     *
     * @param args no args used
     */
    public static void main(final String[] args) {

        // Use MrCoxallStack class
        final MrCoxallStack doggyPile = new MrCoxallStack();
        doggyPile.pushString("poodle");
        doggyPile.pushString("retriever");
        doggyPile.pushString("beagle");
        System.out.println("Dog items: " + doggyPile.getStack());
        System.out.println("The stack's size is: " + doggyPile.getSize());
        System.out.println(
            "Is the stack empty? " + String.valueOf(doggyPile.getEmpty())
        );
        while (doggyPile.getSize() > 0) {
            final String topDog = doggyPile.popItem();
            System.out.println("Popped dog item: " + topDog);
        }
        System.out.println("Dog items: " + doggyPile.getStack());
        System.out.println("The stack's size is: " + doggyPile.getSize());
        System.out.println(
            "Is the stack empty? " + String.valueOf(doggyPile.getEmpty())
        );

        System.out.println("\nDone.");
    }
}

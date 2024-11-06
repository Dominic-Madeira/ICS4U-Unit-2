/*
 * The Starting point for the script.
 *
 * @author Dominic M.
 * @since 2024-10-22
 * @version 1.0
 */

/**
 * This is the Colors class.
 */
final class Colors {

    /**
     * Prevent instantiation.
     *
     * @throws IllegalStateException if this is ever called
     *
     */
    private Colors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This is the main function.
     *
     * @param args no args used
     */
    public static void main(final String[] args) {

        // Use MrCoxallStack class
        final MrCoxallStack colorStack = new MrCoxallStack();
        colorStack.pushString("red");
        colorStack.pushString("green");
        colorStack.pushString("blue");
        System.out.println("Color items: " + colorStack.getStack());
        System.out.println("The stack's size is: " + colorStack.getSize());
        System.out.println(
            "Is the stack empty? " + String.valueOf(colorStack.getEmpty())
        );
        while (colorStack.getSize() > 0) {
            final String topColor = colorStack.popItem();
            System.out.println("Popped color item: " + topColor);
        }
        System.out.println("Color items: " + colorStack.getStack());
        System.out.println("The stack's size is: " + colorStack.getSize());
        System.out.println(
            "Is the stack empty? " + String.valueOf(colorStack.getEmpty())
        );

        System.out.println("\nDone.");
    }
}

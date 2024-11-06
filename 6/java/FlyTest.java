/*
 * The FlyTest Class.
 *
 * @author Dominic M.
 * @since 2024-9-22
 * @version 1.0
 */

/**
 * This is the FlyTest Class.
 */
public final class FlyTest {

    /**
     * Prevent instantiation.
     *
     * @throws IllegalStateException if this is ever called
     *
     */
    private FlyTest() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This is the main function.
     *
     * @param args no args used
     */
    public static void main(final String[] args) {
        Airplane biplane = new Airplane();
        biplane.setSpeed(212);
        System.out.println(biplane.getSpeed());
        Jet boeing = new Jet();
        boeing.setSpeed(422);
        System.out.println(boeing.getSpeed());
        int x = 0;
        while (x < 4) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
                if (boeing.getSpeed() > 5000) {
                    biplane.setSpeed(biplane.getSpeed() * 2);
                } else {
                    boeing.accelerate();
                }
            x++;
        }
        System.out.println(biplane.getSpeed());
    }
}

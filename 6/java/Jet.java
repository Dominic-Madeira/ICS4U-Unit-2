/**
 * The Jet Class.
 *
 * @author Dominic M.
 * @since 2024-9-22
 * @version 1.0
 */

/**
 * This is the Jet Class
 */
public class Jet extends Airplane {
    /**
     * The speed of the plane.
     */
    private static final int MULTIPLYER = 2;

    /**
     * This is the constructor.
     */
    public Jet() {
        super();
    }

    /**
     * Sets the speed by mutiplying the inputted speed by the multiplyer.
     */
    public void setSpeed(int speed) {
        super.setSpeed(speed * MULTIPLYER);
    }

    /**
     * Sets the speed by doubling the speed.
     */
    public void accelerate() {
        super.setSpeed(getSpeed() * 2);
    }
}

/*
 * The Airplane Class.
 *
 * @author Dominic M.
 * @since 2024-9-22
 * @version 1.0
 */

/**
 * This is the Airplane Class.
 */
final class Airplane {
    /**
     * The speed of the plane.
     */
    private int speed;

    /**
     * This is the constructor.
     */
    private Airplane() {
        this.speed = 0;
    }

    /**
     * Gets the speed.
     *
     * @return speed of plane
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Sets the speed.
     *
     * @param newSpeed of plane
     */
    public void setSpeed(final int newSpeed) {
      if (newSpeed > 0) {
        this.speed = newSpeed;
      } else {
        this.speed = 0;
      }
    }
}

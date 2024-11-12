/*
    }
 * The Vehicle Class.
 *
 * @author Dominic M.
 * @since 2024-10-28
 * @version 1.0
 */

/**
 * This is the Vehicle Class.
 */
public class Vehicle {

    /**
     * The color of car.
     */
    private static String color;

    /**
     * The speed of car.
     */
    private static int speed;

    /**
     * The max speed.
     */
    private static int maxSpeed;

    /**
     * This is the constructor.
     *
     * @param colour of car
     * @param maximumSpeed of car
     */
    public Vehicle(final String colour, final int maximumSpeed) {
        color = colour;
        speed = 0;
        maxSpeed = maximumSpeed;
    }

    /**
     * Getter for car color.
     *
     * @return string of car color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the car color.
     *
     * @param newColor of car
     */
    public void setColor(final String newColor) {
        if (newColor != null) {
            color = newColor;
        } else {
            color = "silver";
        }
    }

    /**
     * Getter for car speed.
     *
     * @return speed of car
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Getter for maxSpeed
     *
     * @return max speed
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * This method accelerates the car.
     *
     * @param accelPower how much force is being put into acceleration
     * @param accelTime how long it is accelerating for
     */
    public void accelerate(final int accelPower, final int accelTime) {
        speed = (accelPower * accelTime) + speed;
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    /**
     * This method brakes the car.
     *
     * @param brakePower how much force is being put into the brakes
     * @param brakeTime how long it is braking for
     */
    public void brake(final int brakePower, final int brakeTime) {
        speed = speed - (brakePower * brakeTime);
        if (speed < 0) {
          speed = 0;
        }
    }
}

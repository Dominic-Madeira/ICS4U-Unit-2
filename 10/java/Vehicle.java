/*
 * The Vehicle Class.
 *
 * @author Dominic M.
 * @since 2024-10-28
 * @version 1.0
 */

/**
 * This is the Vehicle Class.
 */
public abstract class Vehicle {

    /**
     * The color of car.
     */
    private String color;

    /**
     * The speed of car.
     */
    private int speed;

    /**
     * The max speed.
     */
    private int maxSpeed;

    /**
     * The wheels of the vehicle.
     */
    private int wheels;

    /**
     * This is the constructor.
     *
     * @param colour of car
     * @param maximumSpeed of car
     * @param wheel of car
     */
    public Vehicle(
        final String colour, final int maximumSpeed, final int wheel
    ) {
        this.color = colour;
        this.speed = 0;
        this.maxSpeed = maximumSpeed;
        this.wheels = wheel;
    }

    /**
     * Getter for car color.
     *
     * @return string of car color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Sets the car color.
     *
     * @param newColor of car
     */
    public void setColor(final String newColor) {
        if (newColor != null) {
            this.color = newColor;
        } else {
            this.color = "silver";
        }
    }

    /**
     * Getter for car speed.
     *
     * @return speed of car
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Sets the speed.
     *
     * @param newSpeed of vehicle
     */
    public void setSpeed(final int newSpeed) {
        if (newSpeed > 0 && newSpeed < maxSpeed) {
            this.speed = newSpeed;
        }
    }

    /**
     * Getter for maxSpeed.
     *
     * @return max speed
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Getter for wheels.
     *
     * @return amount of wheels
     */
    public int getWheels() {
      return this.wheels;
    }

    /**
     * Setter for wheels.
     *
     * @param newWheels amount
     */
    public void setWheels(final int newWheels) {
      if (newWheels > 0) {
        this.wheels = newWheels;
      }
    }

    /**
     * This method accelerates the car.
     *
     * @param accelPower how much force is being put into acceleration
     * @param accelTime how long it is accelerating for
     */
    public void accelerate(final int accelPower, final int accelTime) {
        speed = (accelPower * accelTime) + speed;
        if (this.speed > maxSpeed) {
            this.speed = maxSpeed;
        }
    }

    /**
     * This method brakes the car.
     *
     * @param brakePower how much force is being put into the brakes
     * @param brakeTime how long it is braking for
     */
    public void brake(final int brakePower, final int brakeTime) {
        this.speed = this.speed - (brakePower * brakeTime);
        if (this.speed < 0) {
          this.speed = 0;
        }
    }
}

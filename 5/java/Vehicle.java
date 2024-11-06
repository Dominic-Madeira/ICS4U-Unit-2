/*
 * The Vehicle Class.
 *
 * @author Dominic M.
 * @since 2024-9-22
 * @version 1.0
 */

import java.util.Arrays;
import java.util.List;

/**
 * This is the Vehicle Class.
 */
final class Vehicle {

    /**
     * The license plate.
     */
    private String licensePlate;

    /**
     * The color of car.
     */
    private String color;

    /**
     * The speed of car.
     */
    private int speed;

    /**
     * The amount of doors.
     */
    private int doorsNumber;

    /**
     * The max speed.
     */
    private int maxSpeed;

    /**
     * This is the constructor.
     *
     * @param colour of car
     * @param liscensePlate number
     * @param doorNumber on car
     * @param maximumSpeed of car
     */
    private Vehicle(
        final String colour, final String liscensePlate,
        final int doorNumber, final int maximumSpeed
    ) {
        this.licensePlate = liscensePlate;
        this.color = colour;
        this.speed = 0;
        this.doorsNumber = doorNumber;
        this.maxSpeed = maximumSpeed;
    }

    /**
     * Getter for the license plate.
     *
     * @return string of license plate
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * Sets the license plate number.
     *
     * @param newPlate the new license plate number
     */
    public void setLicensePlate(final String newPlate) {
      if (newPlate != null) {
          this.licensePlate = newPlate;
      }
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
     * Getter for car status.
     *
     * @return type List<Object> which means a list of any type

     */
    public List<Object> status() {
      // creates a fixed size list
      return Arrays.asList(
          this.speed, this.maxSpeed, this.doorsNumber,
          this.licensePlate, this.color
      );
    }

    /**
     * This method accelerates the car.
     *
     * @param accelPower how much force is being put into acceleration
     * @param accelTime how long it is accelerating for
     */
    public void accelerate(final int accelPower, final int accelTime) {
        this.speed = (accelPower * accelTime) + this.speed;
        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
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

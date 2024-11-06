/**
 * The Vehicle Class.
 *
 * @author Dominic M.
 * @since 2024-9-22
 * @version 1.0
 */

/**
 * This is the Vehicle Class.
 */
public class Vehicle {

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
     */
    private Vehicle(
        String color, String licensePlate, int doorsNumber, int maxSpeed
    ) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.speed = 0;
        this.doorsNumber = doorsNumber;
        this.maxSpeed = maxSpeed;
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
    public void setLicensePlate(String newPlate) {
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
    public void setColor(String newColor) {
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
     * @return array of strings of the car properties
     */
    public status {

    }

    /**
     * This method accelerates the car.
     *
     * @param accelPower how much force is being put into acceleration
     * @param accelTime how long it is accelerating for
     */
    public void accelerate (int accelPower, int accelTime) {
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
    public void brake (int brakePower, int brakeTime) {
        this.speed = this.speed - (brakePower * brakeTime);
        if (this.speed < 0) {
          this.speed = 0;
        }
    }
}

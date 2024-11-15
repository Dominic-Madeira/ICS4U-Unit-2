/*
 * The Truck Class.
 *
 * @author Dominic M.
 * @since 2024-9-22
 * @version 1.0
 */

import java.util.Arrays;
import java.util.List;

/**
 * This is the Truck Class.
 */
public class Truck extends Vehicle {

    /**
     * The license plate.
     */
    private String licensePlate;

    /**
     * The amount of doors.
     */
    private int doorsNumber;

    /**
     * This is the constructor.
     *
     * @param colour of car
     * @param liscensePlate number
     * @param maximumSpeed of car
     * @param wheels of car
     */
    public Truck(
        final String colour, final String liscensePlate,
        final int maximumSpeed, final int wheels
    ) {
        super(colour, maximumSpeed, wheels);
        this.licensePlate = liscensePlate;
        this.doorsNumber = 2;
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
     * Getter for Truck status.
     *
     * @param index of property to return
     * @return index of status
     */
    public Object status(final int index) {
      // creates a fixed size list of type object which is any type
      List<Object> status = Arrays.asList(
          getSpeed(), getMaxSpeed(), getColor(), this.licensePlate, getWheels()
      );
      return status.get(index);
    }

    /**
     * This method slows the truck down using air.
     *
     * @param airPressure how much air is being put in the tires
     */
    public void provideAir(final int airPressure) {
        setSpeed(getSpeed() - airPressure / 2);
        if (getSpeed() < 0) {
            setSpeed(0);
        }
    }
}

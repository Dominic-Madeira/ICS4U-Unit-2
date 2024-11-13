/*
 * The Bike Class.
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
public class Bike extends Vehicle {

    /**
     * The cadence of bike.
     */
    private int cadence;

    /**
     * The gear of bike.
     */
    private int gear;

    /**
     * This is the constructor.
     *
     * @param colour of car
     * @param maximumSpeed of car
     */
    public Bike(final String colour, final int maximumSpeed) {
        super(colour, maximumSpeed);
        this.cadence = 0;
        this.gear = 0;
    }

    /**
     * Getter for car status.
     *
     * @param index of property to return
     * @return index of status needed
     */
    public Object status(final int index) {
      // creates a fixed size list of type object which is any type
      List<Object> status = Arrays.asList(
          getSpeed(), getMaxSpeed(), getColor(), this.cadence
          );
      return status.get(index);
    }

    /**
     * This method accelerates the car.
     *
     * @param appliedPower how much force is being put into acceleration
     * @param newGear how long it is accelerating for
     */
    public void accelerate(final int appliedPower, final int newGear) {
        this.cadence = this.cadence + appliedPower;
        this.gear = newGear;
        setSpeed(getSpeed() + (this.cadence * this.gear));
        if (getSpeed() > getMaxSpeed()) {
            setSpeed(getMaxSpeed());
        }
    }

    /**
     * This method rings the bell.
     *
     * @return bell sound
     */
    public String ring() {
        final String bell = "Ding ding!\n";
        return bell;
    }
}

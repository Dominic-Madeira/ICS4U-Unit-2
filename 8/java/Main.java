/*
* This is the main code that runs with the Vehicle Class.
*
* @author  Dominic M.
* @version 1.0
* @since   2024-01-01
*/

/**
* This is the Main program.
*/
final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if instantiation is attempted
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // new Bike
        System.out.println("Created Bmx bike.");
        final Bike bmxBike = new Bike("Red", 40);

        System.out.println("Status:");
        System.out.println(" -> Speed: " + bmxBike.status(0));
        System.out.println(" -> Max Speed: " + bmxBike.status(1));
        System.out.println(" -> Color: " + bmxBike.status(2));
        System.out.println(" -> Cadence: " + bmxBike.status(3));
        System.out.println(" -> Wheels: " + bmxBike.status(4));


        System.out.println("\nSet cadence to 10");
        bmxBike.accelerate(10, 2);
        System.out.println(" -> Speed: " + bmxBike.status(0));
        System.out.println(" -> Max Speed: " + bmxBike.status(1));
        System.out.println(" -> Color: " + bmxBike.status(2));
        System.out.println(" -> Cadence: " + bmxBike.status(3));
        System.out.println(" -> Wheels: " + bmxBike.status(4));


        System.out.println("\nAccelerate by 15:");
        bmxBike.accelerate(15, 2);
        System.out.println(" -> Speed: " + bmxBike.status(0));
        System.out.println(" -> Max Speed: " + bmxBike.status(1));
        System.out.println(" -> Color: " + bmxBike.status(2));
        System.out.println(" -> Cadence: " + bmxBike.status(3));
        System.out.println(" -> Wheels: " + bmxBike.status(4));


        System.out.println("\nRinging bell");
        System.out.println(bmxBike.ring());

        // New Truck
        System.out.println("Created a Truck");
        final Truck truck = new Truck("Grey", "HGC-3456F", 200, 18);

        System.out.println("Status:");
        System.out.println(" -> Speed: " + truck.status(0));
        System.out.println(" -> Max Speed: " + truck.status(1));
        System.out.println(" -> Color: " + truck.status(2));
        System.out.println(" -> License Plate: " + truck.status(3));
        System.out.println(" -> Wheels: " + truck.status(4));


        System.out.println("\nAccelerating, 20 of power for ten sec:");
        truck.accelerate(20, 10);
        System.out.println("New speed: " + truck.getSpeed());

        System.out.println("\nBreaking, 10 of power for 10 sec.");
        truck.brake(10, 10);
        System.out.println("New speed: " + truck.getSpeed());

        System.out.println("\nApplied air pressure of 10");
        truck.provideAir(10);
        System.out.println("New speed: " + truck.getSpeed());

        System.out.println("\nDone.");
    }
}

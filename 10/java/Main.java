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

        // try to create a new Vehicle
        System.out.println("Creating a Vehicle.");
        final Vehicle car = new Vehicle("Red", 40);

        // if a car is created, accelerate it
        car.accelerate(20, 10);

        System.out.println("\nDone.");
    }
}

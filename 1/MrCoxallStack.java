/*
 * The MrCoxallStack Class
 *
 * @author Dominic M.
 * @since 2024-10-22
 * @version 1.0
 */
is program finds the max run in a string.

import java.util.ArrayList;

/**
 * This is the MrCoxallStack class.
 */
final class MrCoxallStack {

    /**
     * The MrCoxallStack list
     */
    ArrayList<String> stackList = new ArrayList<>();

    /**
     * Prevent instantiation.
     *
     * @throws IllegalStateException if this is ever called
     *
     */
    private MrCoxallStack() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This is the max run function.
     *
     * @param userString of characters that the user inputs
     * @return integer of the max run
     */
    private static int maxRun(final String userString) {
        char lastCharacter = '\0'; // '\0 makes a char null'
        int currentRun = 1;
        int greatestRun = 0;

        // make an array and for each character in the array
        // check if it is the same as the previous one
        for (char currentCharacter : userString.toCharArray()) {
            if (lastCharacter == currentCharacter) {
                currentRun++;
            } else {
                lastCharacter = currentCharacter;
                if (greatestRun < currentRun) {
                    greatestRun = currentRun;
                }
                currentRun = 1;
            }
        }
        if (greatestRun < currentRun) {
            greatestRun = currentRun;
        }

        return greatestRun;
    }
}


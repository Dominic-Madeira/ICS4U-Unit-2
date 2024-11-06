/*
 * The MrCoxallStack Class.
 *
 * @author Dominic M.
 * @since 2024-10-22
 * @version 1.0
 */

import java.util.ArrayList;

/**
 * This is the MrCoxallStack class.
 */
public class MrCoxallStack {

    /**
     * The MrCoxallStack list.
     */
    private ArrayList<String> stackList;

    /**
     * The constructor for the stack.
     */
    public MrCoxallStack() {
        this.stackList = new ArrayList<String>();
    }

    /**
     * This method pushes a string into the stack.
     *
     * @param pushedString - The string to push into the stack
     */
    public void pushString(final String pushedString) {
        this.stackList.add(pushedString);
    }

    /**
     * This method returns the stack as a string.
     *
     * @return the stack as a string
     */
    public String showStack() {
        String stackValues = "";
        for (int counter = 0; counter < this.stackList.size(); counter++) {
            stackValues += this.stackList.get(counter) + ", ";
        }
        stackValues = stackValues.substring(0, stackValues.length() - 2);
        return stackValues;
    }
}

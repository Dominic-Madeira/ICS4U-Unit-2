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
     * This method returns the stack as a string.
     *
     * @return the stack as a string
     */
    public String getStack() {
        String stackValues = "";
        if (!getEmpty()) {
            for (int counter = 0; counter < this.stackList.size(); counter++) {
                stackValues += this.stackList.get(counter) + ", ";
            }
            stackValues = stackValues.substring(0, stackValues.length() - 2);
        }
        return stackValues;
    }

    /**
     * Getter for the stack amount.
     *
     * @return number of items in stack
     */
    public int getSize() {
        return this.stackList.size();
    }

    /**
     * Getter to check if stack is empty.
     *
     * @return boolean whether or not the stack is empty
     */
    public boolean getEmpty() {
        return this.getSize() == 0;
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
     * This method pops a string from the stack.
     *
     * @return string popped from stack
     */
    public String popItem() {
        String returnString = "";
        if (this.stackList.size() > 0) {
            final String topItem = this.stackList.get(
                this.stackList.size() - 1
            );
            this.stackList.remove(this.stackList.size() - 1);
            returnString = topItem;
        } else {
            returnString = "Invalid Input!";
        }
        return returnString;
    }
}

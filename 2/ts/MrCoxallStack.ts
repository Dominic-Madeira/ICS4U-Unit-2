/**
 * The MrCoxallStack Class
 *
 * author Dominic M.
 * version 1.0
 * since 2024-10-16
 */

export class MrCoxallStack {
  /**
   * The MrCoxallStack list
   */
  private stackList: string[] = []

  //getters
  /**
   * Getter for the formatted stack values
   *
   * @returns {string} the stack as a string
   */
  public getStack (): string {
    let stackValues = ''
    for (let counter = 0; counter < this.stackList.length; counter++) {
      stackValues += this.stackList[counter] + ', '
    }
    stackValues = stackValues.substring(-1, stackValues.length - 2)
    return stackValues
  }

  /**
   * This method pushes a string into the stack
   *
   * @param {string} pushedString - The string to push into the stack
   */
  public pushString (pushedString): void {
    this.stackList.push(pushedString)
  }

  /**
   * This method pops a string from the stack
   *
   * @returns {string} that was popped from stack
   */
  public popItem (): string {
    let returnString = ''
    if (this.stackList.length > 0) {
      const topItem = this.stackList[this.stackList.length - 1]
      this.stackList.splice(-1, 1)
      returnString = topItem
    } else {
      returnString = 'Invalid Input!'
    }
    return returnString
  }
}

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
  stackList: string[] = []

  /**
   * This method pushes a string into the stack
   *
   * @param {string} pushedString - The string to push into the stack
   */
  public pushString (pushedString) {
    this.stackList.push(pushedString)
  }

  /**
   * This method returns the stack as a string
   *
   * @returns {string} the stack as a string
   */
  public showStack () {
    let stackValues = ''
    for (let counter = 0; counter < this.stackList.length; counter++) {
      stackValues += this.stackList[counter] + ', '
    }
    stackValues = stackValues.substring(0, stackValues.length - 2)
    return stackValues
  }
}

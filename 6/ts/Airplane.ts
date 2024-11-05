/**
 * The Airplane Class
 *
 * author Dominic M.
 * version 1.0
 * since 2024-10-16
 */

export class Airplane {
  /**
   * The speed of plane
   */
  private speed: number

  constructor () {
    this.speed = 0
  }

  /**
   * Getter for the speed
   */
  public get theSpeed (): number {
    return this.speed
  }

  /**
   * Setter for the speed
   */
  public set theSpeed (speed: number) {
    if (speed > 0) {
        this.speed = speed
    } else {
        this.speed = 0
    }
  }
}

/**
 * The Airplane Class
 *
 * author Dominic M.
 * version 1.0
 * since 2024-10-16
 */

import { Airplane } from './Airplane.ts'

export class Jet extends Airplane {
  /**
   * The speed of plane
   */
  private readonly MULTIPLYER: number = 2

  constructor () {
    super()
  }

  /**
   * Sets the speed by multipying inputted speed by multiplyer
   */
  public set theSpeed (speed: number): void {
    super.theSpeed(speed * this.MULTIPLYER)
  }

  /**
   * Sets the speed by multiplying the speed by 2
   */
  public accelerate (): void {
    super.theSpeed(theSpeed() * 2)
  }
}

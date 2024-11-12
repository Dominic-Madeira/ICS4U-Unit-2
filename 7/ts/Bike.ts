/**
 * The Vehicle Class
 *
 * author Dominic M.
 * version 1.0
 * since 2024-10-28
 */

import { Vehicle } from './Vehicle.ts'

export class Bike extends Vehicle {
  /**
   * The cadence of bike
   */
  private cadence: number

  /**
   * The gear of bike
   */
  private gear: number

  constructor (color: string, maxSpeed: number) {
    super(color, maxSpeed)
    this.cadence = 0
    this.gear = 0
  }

  /**
   * Getter for truck status
   *
   * @returns {string} of car properties
   */
  public get status (): Array<number | string> {
    return [this.speed, this.maxSpeed, this.color, this.cadence]
  }

  /**
   * This method accelerates the bike
   *
   * @param {number} appliedPower
   * @param {number} newGear
   */
  public accelerate (appliedPower: number, newGear: number): void {
    this.cadence = this.cadence + appliedPower
    this.gear = newGear
    this.speed = this.speed + (this.cadence * this.gear)
    if (this.speed > this.maxSpeed) {
      this.speed = this.maxSpeed
    }
  }

  /**
   * This method rings the bell
   *
   * @return {string} bell sound
   */
  public ring (): string {
    const bell = 'Ding ding!\n'
    return bell
  }
}

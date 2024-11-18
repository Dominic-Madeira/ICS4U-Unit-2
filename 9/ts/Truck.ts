/**
 * The Truck Class
 *
 * author Dominic M.
 * version 1.0
 * since 2024-10-28
 */

import { Vehicle } from './Vehicle.ts'

export class Truck extends Vehicle {
  /**
   * The license plate
   */
  private licensePlate: string

  /**
   * The amount of doors
   */
  private readonly doorsNumber: number

  constructor (color: string, licensePlate: string, maxSpeed: number, wheels: number) {
    super(color, maxSpeed, wheels)
    this.licensePlate = licensePlate
    this.doorsNumber = 2
  }

  /**
   * Getter for the license plate
   *
   * @returns {string} of license plate
   */
  public get theLicensePlate (): string {
    return this.licensePlate
  }

  /**
   * Sets the license plate number
   *
   * @param {string} newPlate
   */
  public set theLicensePlate (newPlate: string) {
    if (newPlate != null) {
      this.licensePlate = newPlate
    }
  }

  /**
   * Getter for car status
   *
   * @returns {string} of car properties
   */
  public get status (): Array<number | string> {
    return [this.speed, this.maxSpeed, this.color, this.licensePlate, this.wheels]
  }

  /**
   * Slows the truck down using air pressure
   *
   * @param {number} airPressure
   */
  public break (breakPower: number, breakTime: number, airPressure: number): void {
    this.speed = this.speed - (breakPower * breakTime) - (airPressure * breakTime)
    if (this.speed < 0) {
      this.speed = 0
    }
  }
}

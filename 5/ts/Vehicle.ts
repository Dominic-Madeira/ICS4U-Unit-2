/**
 * The Vehicle Class
 *
 * author Dominic M.
 * version 1.0
 * since 2024-10-28
 */

export class Vehicle {
  /**
   * The license plate
   */
  private licensePlate: string

  /**
   * The color of car
   */
  private color: string

  /**
   * The speed of car
   */
  private speed: number

  /**
   * The amount of doors
   */
  private readonly doorsNumber: number

  /**
   * The max speed
   */
  private readonly maxSpeed: number

  constructor (color: string, licensePlate: string, doorsNumber: number, maxSpeed: number) {
    this.licensePlate = licensePlate
    this.color = color
    this.speed = 0
    this.doorsNumber = doorsNumber
    this.maxSpeed = maxSpeed
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
   * Getter for car color
   *
   * @returns {string} of car color
   */
  public get theColor (): string {
    return this.color
  }

  /**
   * Sets the car color
   *
   * @param {string} newColor of car
   */
  public set theColor (newColor: string) {
    if (newColor != null) {
      this.color = newColor
    }
  }

  /**
   * Getter for car speed
   *
   * @returns {number} of car speed
   */
  public get theSpeed (): number {
    return this.speed
  }

  /**
   * Getter for car status
   *
   * @returns {string} of car properties
   */
  public get status (): Array<number | string> {
    return [this.speed, this.maxSpeed, this.doorsNumber, this.licensePlate, this.color]
  }

  /**
   * This method accelerates the car
   *
   * @param {number} accelPower
   * @param {number} accelTime
   */
  public accelerate (accelPower: number, accelTime: number): void {
    this.speed = (accelPower * accelTime) + this.speed
    if (this.speed > this.maxSpeed) {
      this.speed = this.maxSpeed
    }
  }

  /**
   * This method decelerates the car
   *
   * @param {number} breakPower
   * @param {number} breakTime
   */
  public break (breakPower: number, breakTime: number): void {
    this.speed = this.speed - (breakPower * breakTime)
    if (this.speed < 0) {
      this.speed = 0
    }
  }
}

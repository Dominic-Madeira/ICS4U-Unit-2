/**
 * The Vehicle Class
 *
 * author Dominic M.
 * version 1.0
 * since 2024-10-28
 */

export class Vehicle {
  /**
   * The color of car
   */
  protected color: string

  /**
   * The speed of car
   */
  protected speed: number

  /**
   * The max speed
   */
  protected readonly maxSpeed: number

  /**
   * The amount of wheels in the vehicle
   */
  protected wheels: number

  /**
   * This is the constructor
   * 
   * @param color 
   * @param maxSpeed 
   * @param wheels 
   */
  constructor (color: string, maxSpeed: number, wheels: number) {
    this.color = color
    this.speed = 0
    this.maxSpeed = maxSpeed
    this.wheels = wheels
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
    } else {
      this.color = 'silver'
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
   * Getter for max speed
   *
   * @returns {number} of max car speed
   */
  public get theMaxSpeed (): number {
    return this.maxSpeed
  }

  /**
   * Getter for wheels
   *
   * @return {number} of wheels
   */
  public get theWheels (): number {
    return this.wheels
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

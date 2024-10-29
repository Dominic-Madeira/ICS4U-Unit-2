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
  private readonly speed: number = 0

  /**
   * The amount of doors
   */
  private readonly doorsNumber: number = 4

  /**
   * The max speed
   */
  private readonly maxSpeed: number = 60

  constructor(licensePlate: string, color: string){
    this.licensePlate = licensePlate
    this.color = color
  }

  // getters
  /**
   * Getter for the license plate
   *
   * @returns {string} of license plate
   */
  public get getLicensePlate (): string {
    return this.licensePlate
  }

  /**
   * Getter for car color
   *
   * @returns {string} of car color
   */
  public get getColor (): string {
    return this.color
  }

  // setters
  /**
   * Sets the license plate number
   *
   * @param {string} newPlate
   */
  public set setLicensePlate (newPlate: string) {
    if (newPlate != null) {
      this.licensePlate = newPlate
    }
  }

  /**
   * Sets the car color
   *
   * @param {string} newColor of car
   */
  public set setColor (newColor: string) {
    if (newColor != null) {
      this.color = newColor
    }
  }

  /**
   * This method accelerates the car
   *
   * @param {number} accelPower
   * @param {number} accelTime
   */
  public accelerate (accelPower: number, accelTime: number): void {
    this.speed = (accelPower * accelTime) + this.speed
  }

  /**
   * This method decelerates the car
   *
   * @param {number} breakPower
   * @param {number} breakTime
   */
  public break (breakPower: number, breakTime: number): void {
    this.speed = this.speed - (breakPower * breakTime)
  }
}

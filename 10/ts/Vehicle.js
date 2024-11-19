"use strict";
/**
 * The Vehicle Class
 *
 * author Dominic M.
 * version 1.0
 * since 2024-10-28
 */
Object.defineProperty(exports, "__esModule", { value: true });
exports.Vehicle = void 0;
var Vehicle = /** @class */ (function () {
    function Vehicle(color, maxSpeed, wheels) {
        this.color = color;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
        this.wheels = wheels;
    }
    Object.defineProperty(Vehicle.prototype, "theColor", {
        /**
         * Getter for car color
         *
         * @returns {string} of car color
         */
        get: function () {
            return this.color;
        },
        /**
         * Sets the car color
         *
         * @param {string} newColor of car
         */
        set: function (newColor) {
            if (newColor != null) {
                this.color = newColor;
            }
            else {
                this.color = 'silver';
            }
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Vehicle.prototype, "theSpeed", {
        /**
         * Getter for car speed
         *
         * @returns {number} of car speed
         */
        get: function () {
            return this.speed;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Vehicle.prototype, "theMaxSpeed", {
        /**
         * Getter for max speed
         *
         * @returns {number} of max car speed
         */
        get: function () {
            return this.maxSpeed;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Vehicle.prototype, "theWheels", {
        /**
         * Getter for wheels
         *
         * @return {number} of wheels
         */
        get: function () {
            return this.wheels;
        },
        enumerable: false,
        configurable: true
    });
    /**
     * This method accelerates the car
     *
     * @param {number} accelPower
     * @param {number} accelTime
     */
    Vehicle.prototype.accelerate = function (accelPower, accelTime) {
        this.speed = (accelPower * accelTime) + this.speed;
        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
    };
    /**
     * This method decelerates the car
     *
     * @param {number} breakPower
     * @param {number} breakTime
     */
    Vehicle.prototype.break = function (breakPower, breakTime) {
        this.speed = this.speed - (breakPower * breakTime);
        if (this.speed < 0) {
            this.speed = 0;
        }
    };
    return Vehicle;
}());
exports.Vehicle = Vehicle;

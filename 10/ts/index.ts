/**
 * This is the standard index.ts starting point.
 *
 * author Dominic M.
 * version 1.0
 * since 2024-10-28
 */

import { Vehicle } from './Vehicle'

// try to create a new Vehicle
console.log('\nTrying to create new Vehicle')
const car = new Vehicle('Red', 120, 4)

// if car is created, accelerate it
car.accelerate(20, 10)

console.log('\nDone.')

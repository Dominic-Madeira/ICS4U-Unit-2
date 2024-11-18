/**
 * This is the standard index.ts starting point.
 *
 * author Dominic M.
 * version 1.0
 * since 2024-10-28
 */

import { Bike } from './Bike.ts'
import { Truck } from './Truck.ts'

// new Bike
console.log('Created Bmx bike.')
const bmxBike = new Bike('Red', 40)

console.log('Status:')
console.log(` -> Speed: ${bmxBike.status[0]}`)
console.log(` -> Max Speed: ${bmxBike.status[1]}`)
console.log(` -> Color: ${bmxBike.status[2]}`)
console.log(` -> Cadence: ${bmxBike.status[3]}`)
console.log(` -> Wheels: ${bmxBike.status[4]}`)

console.log('\nAccelerate by 30:')
bmxBike.accelerate(30, 1)
console.log(` -> Speed: ${bmxBike.status[0]}`)
console.log(` -> Max Speed: ${bmxBike.status[1]}`)
console.log(` -> Color: ${bmxBike.status[2]}`)
console.log(` -> Cadence: ${bmxBike.status[3]}`)
console.log(` -> Wheels: ${bmxBike.status[4]}`)

console.log('\nBreaking, 10 power for 2 sec. ')
bmxBike.break(10, 2)
console.log(` -> Speed: ${bmxBike.status[0]}`)
console.log(` -> Max Speed: ${bmxBike.status[1]}`)
console.log(` -> Color: ${bmxBike.status[2]}`)
console.log(` -> Cadence: ${bmxBike.status[3]}`)
console.log(` -> Wheels: ${bmxBike.status[4]}`)

console.log('\nRinging bell')
console.log(bmxBike.ring())

// new Truck
console.log('Created a Truck')
const truck = new Truck('Grey', 'HGC-3456F', 200, 18)

console.log('Status:')
console.log(` -> Speed: ${truck.status[0]}`)
console.log(` -> Max Speed: ${truck.status[1]}`)
console.log(` -> Color: ${truck.status[2]}`)
console.log(` -> License Plate: ${truck.status[3]}`)
console.log(` -> Wheels: ${truck.status[4]}`)

console.log('\nAccelerating, 20 of power for ten sec:')
truck.accelerate(20, 10)
console.log(`New speed: ${truck.theSpeed}`)

console.log('\nBreaking, 10 of power for 10 sec with air pressure of 5.')
truck.break(10, 10, 5)
console.log(`New speed: ${truck.theSpeed}`)

console.log('\nDone.')

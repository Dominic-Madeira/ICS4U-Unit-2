/**
 * This is the standard index.ts starting point.
 *
 * author Dominic M.
 * version 1.0
 * since 2024-10-28
 */

import { Vehicle } from './Vehicle'

console.log('Created Ford focus')
const fordFocus = new Vehicle('white', 'B40-C4RR0', 4, 284)

console.log('Status:')
console.log(` -> Speed: ${fordFocus.status[0]}`)
console.log(` -> Max Speed: ${fordFocus.status[1]}`)
console.log(` -> Number of doors: ${fordFocus.status[2]}`)
console.log(` -> License Plate: ${fordFocus.status[3]}`)
console.log(` -> Color: ${fordFocus.status[4]}`)

console.log('Accelerating, 10 of power for 10 sec.')
fordFocus.accelerate(10, 10)
console.log(`New speed: ${fordFocus.theSpeed}`)

console.log('Changing colour to black:')
fordFocus.theColor = 'black'
console.log(`New color: ${fordFocus.theColor}`)

console.log('')

// new Ferrari
console.log('Created a Ferrari')
const ferrari = new Vehicle('red', 'VHD-35HU', 2, 320)

console.log('Status:')
console.log(` -> Speed: ${ferrari.status[0]}`)
console.log(` -> Max Speed: ${ferrari.status[1]}`)
console.log(` -> Number of doors: ${ferrari.status[2]}`)
console.log(` -> License Plate: ${ferrari.status[3]}`)
console.log(` -> Color: ${ferrari.status[4]}`)

console.log('Accelerating, 100 of power for 4 sec.')
ferrari.accelerate(100, 4)
console.log(`New speed: ${ferrari.theSpeed}`)

console.log('Breaking, 10 of power for 10 sec.')
ferrari.break(10, 10)
console.log(`New speed: ${ferrari.theSpeed}`)

console.log('Changing color:')
ferrari.theColor = 'racing red!'
console.log(`New color: ${ferrari.theColor}`)

console.log('')

// new Citroen Ami
console.log('Created a Citroen Ami')
const citroenAmi = new Vehicle('blue', 'FS-695-DQ', 2, 45)

console.log('Status:')
console.log(` -> Speed: ${citroenAmi.status[0]}`)
console.log(` -> Max Speed: ${citroenAmi.status[1]}`)
console.log(` -> Number of doors: ${citroenAmi.status[2]}`)
console.log(` -> License Plate: ${citroenAmi.status[3]}`)
console.log(` -> Color: ${citroenAmi.status[4]}`)

console.log('Accelerating, 5 of power for 10 sec.')
citroenAmi.accelerate(5, 10)
console.log(`New speed: ${citroenAmi.theSpeed}`)

console.log('Breaking, 2 of power for 10 sec.')
citroenAmi.break(2, 10)
console.log(`New speed: ${citroenAmi.theSpeed}`)

console.log('Changing color:')
citroenAmi.theColor = 'purple'
console.log(`New color: ${citroenAmi.theColor}`)

console.log('\nDone.')

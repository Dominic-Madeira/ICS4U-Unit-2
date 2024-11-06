/*
 * The FlyTest.ts starting point.
 *
 * author Dominic M.
 * since 2024-9-22
 * version 1.0
 */

import { Airplane } from './Airplane.ts'
import { Jet } from './Jet.ts'

const biplane = new Airplane()
biplane.theSpeed = 212
console.log(biplane.theSpeed)
const boeing = new Jet()
boeing.setSpeed(422)
console.log(boeing.theSpeed)
let x = 0
while (x < 4) {
  boeing.accelerate()
  console.log(boeing.theSpeed)
  if (boeing.theSpeed > 5000) {
    biplane.theSpeed = biplane.theSpeed * 2
  } else {
    boeing.accelerate()
  }
  x++
}
console.log(biplane.theSpeed)

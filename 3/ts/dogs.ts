/**
 * This is the standard index.ts starting point.
 *
 * author Dominic M.
 * version 1.0
 * since 2024-10-16
 */
import { MrCoxallStack } from './MrCoxallStack.ts'

// Use MrCoxallStack class
const doggyPile = new MrCoxallStack()
doggyPile.pushString('red')
doggyPile.pushString('green')
doggyPile.pushString('blue')
console.log(`Dog items: ${doggyPile.getStack}`)
console.log(`The size of the stack is: ${doggyPile.getSize}`)
console.log(`Is the stack empty? ${doggyPile.getEmpty.toString()}`)
while (doggyPile.getSize > 0) {
  const topDog = doggyPile.popItem()
  console.log(`Popped dog item: ${topDog}`)
}
console.log(`Dog items: ${doggyPile.getStack}`)
console.log(`The size of the stack is: ${doggyPile.getSize}`)
console.log(`Is the stack empty? ${doggyPile.getEmpty.toString()}`)
console.log()

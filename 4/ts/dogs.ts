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
console.log(`Popped dog item: ${doggyPile.popItem()}`)
console.log(`Dog items: ${doggyPile.getStack}`)
console.log(`The size of the stack is: ${doggyPile.getSize}`)
console.log(`Is the stack empty? ${doggyPile.getEmpty.toString()}`)
console.log(`Top dog is: ${doggyPile.peekItem}`)
console.log(`The size of the stack is: ${doggyPile.getSize}`)
console.log("Emptying stack...")
doggyPile.clearStack()
console.log(`Dog items: ${doggyPile.getStack}`)
console.log(`The size of the stack is: ${doggyPile.getSize}`)
console.log(`Is the stack empty? ${doggyPile.getEmpty.toString()}`)
console.log('\nDone.')

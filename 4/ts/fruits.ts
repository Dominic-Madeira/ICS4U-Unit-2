/**
 * This is the standard index.ts starting point.
 *
 * author Dominic M.
 * version 1.0
 * since 2024-10-16
 */
import { MrCoxallStack } from './MrCoxallStack.ts'

// Use MrCoxallStack class
const fruitStack = new MrCoxallStack()
fruitStack.pushString('red')
fruitStack.pushString('green')
fruitStack.pushString('blue')
console.log(`Fruit items: ${fruitStack.getStack}`)
console.log(`The size of the stack is: ${fruitStack.getSize}`)
console.log(`Is the stack empty? ${fruitStack.getEmpty.toString()}`)
console.log(`Popped fruit item: ${fruitStack.popItem()}`)
console.log(`Fruit items: ${fruitStack.getStack}`)
console.log(`The size of the stack is: ${fruitStack.getSize}`)
console.log(`Is the stack empty? ${fruitStack.getEmpty.toString()}`)
console.log(`Top fruit is: ${fruitStack.peekItem}`)
console.log(`The size of the stack is: ${fruitStack.getSize}`)
console.log("Emptying stack...")
fruitStack.clearStack()
console.log(`Fruit items: ${fruitStack.getStack}`)
console.log(`The size of the stack is: ${fruitStack.getSize}`)
console.log(`Is the stack empty? ${fruitStack.getEmpty.toString()}`)
console.log('\nDone.')

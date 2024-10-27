/**
 * This is the standard index.ts starting point.
 *
 * author Dominic M.
 * version 1.0
 * since 2024-10-16
 */
import { MrCoxallStack } from './MrCoxallStack.ts'

// Use MrCoxallStack class
const colorStack = new MrCoxallStack()
colorStack.pushString('red')
colorStack.pushString('green')
colorStack.pushString('blue')
console.log(`Color items: ${colorStack.getStack}`)
console.log(`The size of the stack is: ${colorStack.getSize}`)
console.log(`Is the stack empty? ${colorStack.getEmpty.toString()}`)
console.log(`Popped color item: ${colorStack.popItem()}`)
console.log(`Color items: ${colorStack.getStack}`)
console.log(`The size of the stack is: ${colorStack.getSize}`)
console.log(`Is the stack empty? ${colorStack.getEmpty.toString()}`)
console.log(`Top color is: ${colorStack.peekItem}`)
console.log(`The size of the stack is: ${colorStack.getSize}`)
console.log('Emptying stack...')
colorStack.clearStack()
console.log(`Color items: ${colorStack.getStack}`)
console.log(`The size of the stack is: ${colorStack.getSize}`)
console.log(`Is the stack empty? ${colorStack.getEmpty.toString()}`)
console.log('\nDone.')

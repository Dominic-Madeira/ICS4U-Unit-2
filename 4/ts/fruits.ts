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
fruitStack.pushString('apple')
fruitStack.pushString('banana')
fruitStack.pushString('cherry')
console.log(`Fruit items: ${fruitStack.getStack}`)
console.log(`The size of the stack is: ${fruitStack.getSize}`)
console.log(`Is the stack empty? ${fruitStack.getEmpty.toString()}`)
while (fruitStack.getSize > 0) {
  const topFruit = fruitStack.popItem()
  console.log(`Popped fruit item: ${topFruit}`)
}
console.log(`Fruit items: ${fruitStack.getStack}`)
console.log(`The size of the stack is: ${fruitStack.getSize}`)
console.log(`Is the stack empty? ${fruitStack.getEmpty.toString()}`)
console.log()

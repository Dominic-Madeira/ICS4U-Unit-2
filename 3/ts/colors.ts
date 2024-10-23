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
console.log(`Is the stack empty? ${colorStack.getEmpty}`)
while (colorStack.getSize > 0) {
  let topColor = colorStack.popItem()
  console.log(`Popped color item: ${topColor}`)
}
console.log(`Color items: ${colorStack.getStack}`)
console.log(`The size of the stack is: ${colorStack.getSize}`)
console.log(`Is the stack empty? ${colorStack.getEmpty}`)
console.log()


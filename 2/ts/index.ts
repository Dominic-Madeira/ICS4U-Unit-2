/**
 * This is the standard index.ts starting point.
 *
 * author Dominic M.
 * version 1.0
 * since 2024-10-16
 */
import { MrCoxallStack } from './MrCoxallStack.ts'

// Use MrCoxallStack class
const fruitStack = new MrCoxallStack
fruitStack.pushString('apple')
fruitStack.pushString('banana')
fruitStack.pushString('cherry')
console.log(`Fruit items: ${fruitStack.showStack}`)
let topFruit = fruitStack.popItem()
console.log(`Popped fruit item: ${topFruit}`)
console.log(`Fruit items: ${fruitStack.showStack}`)
console.log()

const colorStack = new MrCoxallStack
colorStack.pushString('red')
colorStack.pushString('green')
colorStack.pushString('blue')
console.log(`Color items: ${colorStack.showStack}`)
let topColor = colorStack.popItem()
console.log(`Popped color item: ${topColor}`)
console.log(`Color items: ${colorStack.showStack}`)
console.log()

const doggyPile = new MrCoxallStack
doggyPile.pushString('poodle')
doggyPile.pushString('retriever')
doggyPile.pushString('beagle')
console.log(`Dog items: ${doggyPile.showStack}`)
let topDog = doggyPile.popItem()
console.log(`Popped dog item: ${topDog}`)
console.log(`Dog items: ${doggyPile.showStack}`)

console.log('\nDone.')

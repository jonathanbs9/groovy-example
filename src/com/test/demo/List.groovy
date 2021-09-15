package com.test.demo

def fruits = ["Apples", "Oranges", "Grapes"]

println fruits[0]
println fruits[1]
println fruits.get(2)

def myList = [1, 2, 3, ['A', 'B', 'Jonathan'], 4]

println myList[2]
println myList[3][2]
println myList.get(3).get(2)
println myList[0..2]
println myList[4..2]
println myList.contains(2)

if (myList.get(3).get(2) == "Jonathan"){
    println true
} else {
    println false
}

println myList.size()
println myList[3].size()

myList.add(999)
println myList

myList[3].add('Brull')
println myList[3]

myList.add(1,"Inserted")
println myList

myList = myList + [39, 40]
println myList

myList = myList.plus([41])
println myList

myList = myList - [39, 40]
println myList

myList = myList.minus([41])
println myList

// Remove first item
myList.pop()
println myList

// Remove Last
myList.removeLast()
println myList

myList.intersect([2,3])
println myList

println myList.reverse()
println myList

def list1 = [5,8,9,4,1,2,7,3]
println list1.sort()
//list1.clear()
println list1.isEmpty()
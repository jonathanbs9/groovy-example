package com.test.demo

def range = 1..10
println range
println range.size()
println range.getFrom()
println range.getTo()

assert range.from == 1 
assert range.to == 10

println range.get(8)
println range[8]

println range.contains(10)
println range.contains(11)

def range2 = range.subList(3,7)
println range2.getFrom()
println range2.getTo()

// iterate on a range
for (i in range2) {
    println i
}

(1..10).each {
    i -> println "value = $i"
}

range.each {
    i -> println "value = $i"
}

println range instanceof java.util.List
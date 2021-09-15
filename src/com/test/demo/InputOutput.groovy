package com.test.demo

print "Enter your name: "
def name = System.console().readLine()
println "Hello $name"

print "Enter first number: "
def num1 = System.console().readLine().toInteger()
println "Number entered: $num1"

print "Enter second number: "
def num2 = System.console().readLine().toInteger()
println "Number entered: $num2"

println "$num1 + $num2 = "+ (num1+num2)

// Output
//print 
//println 
printf "%s | %d  | %.2f \n", ["Jona", 9 , 132.8090]
package com.test.demo

// Conditional statements
// If-Else  Switch-case


def num = -10
if (num > 0)
    println("Positivo")
else if (num < 0)
    println("Negativo")
else 
    println("Cero")

// Switch case
def x = 100
def result =  ""

switch(x) {
    case 0:
        result = "x is cero"
    break
    case {x>0}:
        result = "x is positive"
    break
    case {x<0}:
        result = "x is negative"
    break
    default:
        result = "Invalid number"
}

println result

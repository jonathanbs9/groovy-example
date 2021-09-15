package com.test.demo

def str = "Hello"
def myClosure1 = { name -> println "${str} ${name} !!"}

myClosure1.call("Jonathan")

def myMethod(clos){
    clos.call("Groovy")
}

myMethod(myClosure1)

def myClosure2 = {
    a, b, c ->  return (a+b+c)
}

def res = myClosure2(10, 20, 30)
println res

def myList1 = ["Apples", "Oranges", "bananas", "berries", "Grapes"]
println myList1.each { it }

def myMap = ['subject'  :   'groovy',
              'topic'   :   'closures'
            ]
println myMap.each {it}

def myLista = [1,6,4,44,76,7,5,62,123,43,89,90,100,250]
println myLista.find { item -> item == 123 }
println myLista.findAll {item -> item >= 62}
println myLista.any {item -> item > 100}
println myLista.every {item -> item > 1}
println myLista.collect {item -> item *2}
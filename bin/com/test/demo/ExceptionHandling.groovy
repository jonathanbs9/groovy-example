package com.test.demo

try {
    int i = 1/1
    println i
} 
catch (ArithmeticException e){
    println ("Cannot divide into 0")
    //println e.getCause()
    //println e.getMessage()
    //e.printStackTrace()   
}
catch (Exception e1){
    println e1.getCause()
    println e1.getMessage()
    e1.printStackTrace()   
} finally {
    println("I'm inside Finally block")
}


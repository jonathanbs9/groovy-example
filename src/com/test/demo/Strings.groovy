package com.test.demo

def name = "Jona"
def name1 = 'Jona B'
def name2 = '''Jonathan Brull Schroeder'''
def string1 = """ 
    This is a groovy class

    and 

    we are learning strings
"""
println "My name is: ".concat(name)
println "My name is: ${name}"
println "My name is: $name"
println "-"
println string1

println "My name is: ".concat(name1)
println name1.length()
println "Pos 2: ".concat(name2[2])
println "Pos -2: ".concat(name2[-2])
println  "index of S: "+name2.indexOf('S')
println name2[3..6]
println name2[-3..-6]

def str = "Su envío ha sido generado pero aún no ha sido entregado a DHL"
println str.split(" ")
println str-("generado")
println str
println str.replace("generado", "regenerado")
println str.toList()

println "Jona".equals("Jonathan")
println "Jona".equals("Jona")

def name3 = "Jonat"
def st1 = /Que onda con esto? $name3/
def st2 = $/Blue sky - $name3/$

println st1
println st2
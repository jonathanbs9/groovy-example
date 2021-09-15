package com.test.demo

def employee = [
    'name': 'John',
    'age' : '35'
]

println employee.name +"\n"+
        employee.get('name')+"\n"+
        employee['name']

println employee.getAt('age')
println employee.size()
employee.put('country', 'Argentina')
println employee

println employee.containsKey('country')
println employee.containsValue('Argentina')
println employee.getClass()

def emp2 = employee.clone()
println emp2

employee.each { key, value -> 
    println "$key with value => $value"
}

employee.eachWithIndex { key, value, i -> println "$i | $key : $value"}

employee.each { entry -> println "$entry.key : $entry.value" }
employee.eachWithIndex { entry, i -> println "<$i> | $entry.key : $entry.value" }

def map1 = ['first_name': 'Jonathan', 'age': '50', 'city': 'Mar del Plata']
def entries = map1.entrySet()

entries.each { entry -> 
    assert entry.key in ['first_name', 'age', 'city']
    //assert entry.value in [ 'Jonathan', '50', 'Mar del Plat']
    assert entry.value in [ 'Jonathan', '50', 'Mar del Plata']
}

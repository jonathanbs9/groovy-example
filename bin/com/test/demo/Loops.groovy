package com.test.demo

// For
int i = 1
for (i; i<=150; i++){
    println i
}

// For in

/*for (a in 1..15) {
    println a
}*/

/*1.upto(15)
{
    println "$it"+" -> cadena"
}

5.times {println "cadena $it"}

1.step(20, 2) {println "paso $it"}
*/

for (j in [0,1,2,3,4,5,6,7,8,9]) {
    println(j)
}

def map = ['name': "Jonathan", 'last_name': "Brull Schroeder", 'age': 35]
x = 0
for (e in map){
    x += e.value
    println("pos: "+e.key+ " | value => "+e.value)
}

int k = 1
while (k < 5){
    println k
    k=k+1
}

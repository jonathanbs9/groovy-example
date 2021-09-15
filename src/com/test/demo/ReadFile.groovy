package com.test.demo

// Read files
String filePath = "src/data.txt"
File myFile = new File(filePath)
println myFile.text

// collect lines into a list
def list = myFile.collect{ it }
println "list : $list"

// store file content in an array
def array =  myFile as String[]
println "Array: " + array

// read File into a list of String
def lines = myFile.readLines()
println "Lines: $lines"

// Read file line by line
myFile.eachLine{ line -> println "line : $line"}

// Read file line by line - 2
myFile.eachLine{ line, i -> println "$i  : $line"}

// Read with reader
def line
myFile.withReader{ reader -> 
    while((line = reader.readLine()) != null){
        println "Line with reader: $line"
    }
}

// Readin with new reader
def outputFile = "data2.txt"
def reader = myFile.newReader()
new File(outputFile).append(reader)
reader.close()

// When workin with binary files, read content as bytes
def byte[] contents = myFile.bytes
println contents

// Size of file in bytes
println myFile.length()

// Check if it's a file or dir 
println myFile.isFile()
println myFile.isDirectory()

// Get list of files from a dir
new File("C:\\Users\\jonat\\Desktop\\administracion").eachFile{ file -> println file.getAbsolutePath()}

// Recursively display all files  in a dir & subdir
new File("C:\\Users\\jonat\\Desktop\\administracion").
    eachFileRecurse {
        file -> println file.getAbsolutePath()
    }

// Copy file data to another file 
def newFile = new File("data3.txt")
newFile << myFile.text

// Delete file
newFile.delete()
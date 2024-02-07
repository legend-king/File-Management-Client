package org.example

import java.io.*
import java.net.Socket

fun main() {
    try {
        val socket = Socket("127.0.0.1",9998)
//        println("Enter file path")
        sendFile(socket)
    } catch (e: Exception){
        e.printStackTrace()
    }
}

fun sendFile(client: Socket) {
    try {
//        val filePath = "/Users/mustafaabdullabhaik/Projects/ClientProject/src/main/resources/test.png"
        val filePath = "/Users/mustafaabdullabhaik/Projects/hello.txt"
        val fileName = filePath.split("/").last()
        var outputStream = DataOutputStream(client.getOutputStream())

        outputStream.write("$fileName\n".toByteArray())
//        for (i in "${filename.length}\n$filename\n".toByteArray()){
//            println(i)
//        }
//        print("$filename\n".toByteArray().size)
        outputStream.flush()
        val file = File(filePath).inputStream()
        while (file.available()>0){
            outputStream.write(file.readNBytes(100000000))
        }
        outputStream.close()
        client.close()
        println("File sent!")
    } catch (e: Exception){
        e.printStackTrace()
    }
}
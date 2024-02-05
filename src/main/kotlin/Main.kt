package org.example

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStreamReader
import java.io.PrintWriter
import java.net.Socket
import java.util.Scanner
import  java.io.*
import java.nio.file.Files
import java.nio.file.Paths
import java.util.Arrays

fun main() {

    try {
        val message = "hello.txt"
        val socket = Socket("localhost",9999)
//        val sc = Scanner(System.`in`)
        println("Connection estb!!")

        var path= "/Users/mustafaabdullabhaik/Projects/ClientProject/src/main/resources/hello.txt"

        //connection established
        val os = socket.getOutputStream()
        val pw = PrintWriter(os,true)
        pw.println(message)
//        val br = BufferedReader(InputStreamReader(socket.getInputStream()))
//        var line = br.readLine()
//        println(line)

        //sending
//        val path = System.getProperty("user.dir") + "\\src\\resources\\.txt"
        val file = Files.readAllBytes(Paths.get(path))
//        val fis = FileInputStream(file)
//        val bis = BufferedInputStream(fis)

//        val dis = DataInputStream(bis)
        val test=Arrays.toString(file)
        print("$test")
        pw.println("$test")
//        val dos = DataOutputStream(os)



//        dos.writeUTF(file.getName());
//        dos.writeLong(file.length());
//
//        val buffer = ByteArray(8192)
//        var read:Int = 0
//        while(read!=-1)
//        {
//            dos.write(buffer,0,read)
//            read = dis.read(buffer)
//        }
//        dos.flush()
//        socket.close()
//        line = br.readLine()

//        val rw = PrintWriter(socket.getInputStream(),true)
//

    }
    catch (ex: Exception){

        ex.printStackTrace()
    }
}
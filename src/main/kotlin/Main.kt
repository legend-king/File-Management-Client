//package org.example
//
//import java.io.BufferedReader
//import java.io.FileInputStream
//import java.io.IOException
//import java.io.InputStreamReader
//import java.io.PrintWriter
//import java.net.Socket
//import java.util.Scanner
//import  java.io.*
//import java.nio.file.Files
//import java.nio.file.Paths
//import java.util.Arrays
//
//fun main() {
//
//    try {
//        val socket = Socket("localhost",9999)
////        val sc = Scanner(System.`in`)
//        println("Connection estb!!")
//        println("Enter the file name : ")
//        var path= readln()
//        var fileName = File(path).name
//        //connection established
////        "/Users/mustafaabdullabhaik/Projects/ClientProject/src/main/resources/hello.txt"
//        val os = socket.getOutputStream()
//        val pw = PrintWriter(os,true)
//        pw.println(fileName)
////        val br = BufferedReader(InputStreamReader(socket.getInputStream()))
////        var line = br.readLine()
////        println(line)
//
//        //sending
////        val path = System.getProperty("user.dir") + "\\src\\resources\\.txt"
//        val file = Files.readAllBytes(Paths.get(path))
////        val fis = FileInputStream(file)
////        val bis = BufferedInputStream(fis)
//
////        val dis = DataInputStream(bis)
//        val test=Arrays.toString(file)
//        print("$test")
//        pw.println("$test")
////        val dos = DataOutputStream(os)
//
//
//
////        dos.writeUTF(file.getName());
////        dos.writeLong(file.length());
////
////        val buffer = ByteArray(8192)
////        var read:Int = 0
////        while(read!=-1)
////        {
////            dos.write(buffer,0,read)
////            read = dis.read(buffer)
////        }
////        dos.flush()
////        socket.close()
////        line = br.readLine()
//
////        val rw = PrintWriter(socket.getInputStream(),true)
////
//
//    }
//    catch (ex: Exception){
//
//        ex.printStackTrace()
//    }
//}


package org.example

import java.io.PrintWriter
import java.net.Socket
import  java.io.*
fun main(args: Array<String>) {


    try {
        val socket = Socket("localhost",9999)
        println("Connection estb!!")

        val os = socket.getOutputStream()
        val pw = PrintWriter(os,true)
        println("Enter the File Path : ")
        val path= readln()
        val fileName = path.split("/").last()
//        val header = "KTP $filename"
        pw.println(fileName)
        val filedata = File(path)

//        pw.println(header)

        val data = filedata.readBytes()
        data.forEach{
            println(it)
            pw.println(it)
        }
    }
    catch (ex: Exception){
        ex.printStackTrace()
    }
}
package com.youwat.sample;

fun max(a: Int, b: Int): Int = if(a < b) b else if(a == b) 0 else a
fun min(a: Int, b: Int): Int = if(a > b) b else if(a == b) 0 else a

fun main(args: Array<String>) {
    val name: String = "Taro"
    val ifRet: Int = if(name == "Taro") 1 else 2
    fun functions(n: Int) = n + 1
    val hoge = :: functions


    println("Hello $name !")
    println("Hello $ifRet !")
    println(max(1,6))
    println(min(1,6))
    println(hoge(1))
}

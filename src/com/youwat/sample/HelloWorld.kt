package com.youwat.sample;

fun max(a: Int = 9, b: Int): Int = if(a < b) b else if(a == b) 0 else a
fun min(a: Int, b: Int): Int = if(a > b) b else if(a == b) 0 else a

fun double(x: Int) = x + x

fun main(args: Array<String>) {
    val name: String = "Taro!"
    val ifRet: String = if(name == "Taro") "hoge" else "fuga"
    fun functions(n: Int) = n + 1
    val hoge = :: functions


    println("Hello $ifRet !")
    println(max(1,6))
    println(min(1,6))
    println(hoge(1))
    val i = arrayOf(1,2,3,4,5)
    for(x in i) {
        println(double(x))
    }
    Hogehoge().printStr().test()
    var datac = User(age = 14)
    var datab = datac.copy(age = 16)
    println(datab.age)
    println(datac.age)

}

class Hogehoge(val str : String = "hoge") {
    fun printStr(): Hogehoge {
        println(str)
        return this
    }

    fun test() {
        val list = asList(1,2,3)
    }

    fun <T> asList(vararg ts: T): List<T> {
        val result =ArrayList<T>()
        result += ts
        return result
    }
}
data class User(val name: String = "hoge", val age: Int)

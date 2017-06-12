package com.youwat.sample
import com.youwat.example.Rational
import com.youwat.example.Student

/*

fun main(args: Array<String>) {
    val r1 = Rational(1, 4).plus(Rational(1,2))
    val r2 = Rational(1, 4).minus(Rational(1,2))
    println(r1)
    println(r2)
}

*/
fun main(args: Array<String>) {
    val test = Student(name = "hoge", age = 19)
    //val stu = Student(name = "hoge", age = 19)
    println(test.clubName)
    test.clubName = "test"
    println(test.clubName)
}

package com.youwat.example

class Student(var name: String,var age: Int) {
    private var club : String? = null
    var clubName: String
        get() {
            return if (club == null) "帰宅部" else club + "部"
        }
        set(value) {
            this.club = value
        }
    init {
        require(age in 0..200, {"age is overflow"})
        require(name.length in 0..10, {"name is 0-100 length"})
    }
}

package com.example.kotlinlog

abstract class Animal {
    // プロパティ
    var name: String
    var age: String
    // 引数付きコンストラクタ
    constructor(name: String, age: String) {
        this.name = name
        this.age = age
    }

    abstract fun say()
}
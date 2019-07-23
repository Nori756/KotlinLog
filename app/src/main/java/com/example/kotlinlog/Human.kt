package com.example.kotlinlog

import android.util.Log

open class Human: Animal,Thinkable {

    // 引数付きコンストラクタ
    constructor(name: String, age: String): super(name, age){

    }


    override fun say() {
        Log.d("kotlintest", "「私の名前は"+ this.name + "です。"+ "年は"+ this.age +"歳です。」")

    }
    override fun hobby() {
        Log.d("kotlintest", "「私は～～について考える。」")

        }
}


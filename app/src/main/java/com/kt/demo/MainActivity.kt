package com.kt.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
/**
 * https://blog.csdn.net/fesdgasdgasdg/article/details/82054971
 * smallestWidth 限定符适配方案
 * 测试，UI切图的宽高是1080*1920,所以默认的DP是按照360DP，
 * 配合工具pxcook,无需换算直接填写UI设计图宽高,包含文字的大小
 *
 */
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    init {
        val simple: Int? // 类型 Int、默认 getter、必须在构造函数中初始化
        val inferredType = 1 // 类型 Int 、默认 getter
    }


    fun foo() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@forEach // 局部返回到该 lambda 表达式的调用者，即 forEach 循环
            print(it)
        }

        Log.e("MainActivity", "foo");

    }


}

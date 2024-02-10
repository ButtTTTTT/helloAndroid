package top.lhit.myapplication3.model.lesson

import top.lhit.myapplication3.model.Bean.NumUtil
import top.lhit.myapplication3.model.Bean.Person

fun main() {

    //普通类方法
    fun learn(days: Int): Boolean {
        return days > 100;
    }
    //普通类的成员方法
    //需要先构建出来实例对象，才能访问成员方法
    //实例对象的构建需要在类名后面加上括号
    //new Java  new被Kotlin省略掉了
    Person().test()
    //静态类不需要构建就能调用
    println(NumUtil.double(44))

    Person.test2()

    /**
     * 默认参数
     * 形参赋值了就是默认参数
     */
    fun read(offset: Int = 0, start: Int) {
        println(start)
    }
    /**
     * 有默认参数时候可以用具名参数调用另一个参数
     */
    read(start = 1111)

    fun read(offset: Int = 0, start: Int, action: () -> String) {
        println("这是函数参数函数")
    }

    read(start = 122, action = {
        //方法体里面的最后一行，就是该方法的返回值
        var result = "afsd"
        "括号内使用具名函数 作为参数"
    })

    read(start = 555) {
        "括号外传递action参数"
    }
    /**
     * 可变数量的参数 vararg
     *
     */
    fun append(vararg str:Char):String{
        val result = StringBuffer()
        for (c in str) {
            result.append(c)
        }
        return result.toString()
    }
    println(append('1','a','4'))
    val world= charArrayOf('w','r')
    val result =append(*world)
    println(result)
    /**
     * 可变参数的要求：
     * 只有一个参数可以标注为vararg
     *
     */
}
package top.lhit.myapplication3.common.util

import java.lang.Exception

//主函数入口
/**
 * 业务： 一次四则运算表达式计算器
 */
fun main() {
    while (true) {
        println("==================请输入你的表达式==================")
        val input = readLine()
        try {
            input?.let {
                val ret = caculate(it)
                println(
                    """
                ${input}      =      ${ret}
                是否继续使用？(y/n)
            """.trimIndent()
                )
                val cmd = readln()
                cmd?.let {
                    if (it.equals("n")) {
                        System.exit(-1)
                    } else {
                        //继续使用

                    }
                }
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        //结束
    }
}

fun caculate(input: String): String {
    if (input.contains("+")) {
        val numbers = input.trim().split("+")
        return operate(numbers[0].toDouble(), numbers[1].toDouble(), "+").toString()
    } else if (input.contains("-")) {
        val numbers1 = input.trim().split("-")
        return operate(numbers1[0].toDouble(), numbers1[1].toDouble(), "-").toString()
    } else if (input.contains("/")) {
        val numbers1 = input.trim().split("/")
        return operate(numbers1[0].toDouble(), numbers1[1].toDouble(), "/").toString()
    } else if (input.contains("*")) {
        val numbers1 = input.trim().split("*")
        return operate(numbers1[0].toDouble(), numbers1[1].toDouble(), "*").toString()
    } else {
        return "error: 你输入的表达式有误"
    }

}

fun operate(num: Double, num1: Double, operate: String): Double {
    return when (operate) {
        "+" -> num + num1
        "-" -> num - num1
        "/" -> num / num1
        "*" -> num * num1
        else -> 0.0
    }
}

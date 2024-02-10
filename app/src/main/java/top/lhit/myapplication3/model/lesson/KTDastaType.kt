package top.lhit.myapplication3.model.lesson

//kotlin 数据类型
fun main() {
    //1、如何声明一个基本数据类型的变量，有那些方式？
    //基本数值类型的默认类型 均为Int ,吐过超过了Int的取值范围，则会推断为Long
    val number = 100 //编辑器会根据赋值100 ，推断变脸number数据类型 类似 js 中的var
    val bigNumber = 80000000000//徐然没有明确指定类型，但是编辑器会判断是否超过了Int的范围 所以bigNumber的数据类型会升级为Long
    //在赋值的数字后面加上L，会自动编程Long类型
    val longNumber = 23L;
    //在变量的后面+ ： +数据类型
    val byteNumber: Byte = 1;

    //浮点类型
    //编辑器同样会根据赋值 来推断变量的类型  默认式Double类型
    val doubleNumber = 3.15423;

    val floatNumber = 3.141412f; // 显式的表明这个变量为float类型

    println("floatNumber:" + floatNumber);
    println("doubleNumber:" + doubleNumber);

    //字符类型
    //赋值的时候式用单引号
    val char: Char = '1';
    //布尔类型 使用Boolean只能有true false

    val isVisible: Boolean = false //true
    val isVisible2: Boolean = true //false

    //字符串类型
    val str: String = " 21344";

    val strNumber = str[2] //字符类型

    //字符串模板
    val number111 = 100
    //字符串的模板表达式 以$表达式开始
    println("The Result is $number111")
    //或者用{}来获取某个元素
    println("Text Lenth is ${str.length}")
    //字符串拼接操作
    println("I am " + 10 + "years old!")
    //转义字符串和转义字符
    val helloWorld = "Hello World\n"
    print(helloWorld + "\n" + "how are you ")
    //helloWorld3 要求它的字符串内容式json格式的，
    //
    val helloWorld3 = "{\"key\":\"value\"}"
    //字符串使用三个引号(""")分界符括起来，内部没有转义
    //并且可以包含换行以及任何其他字符
    //不需要转义字符
    /**
     * """分界符括起来，内部不需要任何转义来
     */
    val text = """
       你好 啊 sbssbsbsbbsbs
       asdjklfjlaksdjf
       zmmvcmzxcnvjlakdsfjgl、
       sajkdfjlkasdjfhgiasndfn
       我的优雅代码
          你好啊
    """.trimIndent()
    /**
     * number.toString()
     * number.toByte()
     *number.toShort()
     * number.toLong()
     * number.toFloat()
     * number.toDouble()
     */
    /**
     * 数据类型的加减乘除
     * 在计算机里面整数除以整数 res还是整数
     */
    val numberInt :Int = 3/2
    println("numberInt:$numberInt")
    //整数除以小数结果是小数
    val numberDouble = 3/2.toDouble()
    println("numberDouble$numberDouble")

    /**
     * 位运算
     */
    val vip = true
    val admin =  false
    //与操作，要求两个都满足，结果才会是true
    val result = vip.and(admin)//false
    //或操作，要求其中一个满足 res 就是true
    val result2 = vip.or(admin)//true
    //无符号右移
    //00001000 ---> 0000 0010 = 2
    val result3 = 8 ushr (2)
    /**
     *
     */
    println("result:$result")
    println("result2:$result2")
    println("result3:$result3")


    /**
     * Kotlin 数据容器
     * Kotlin 数组
     * Kotlin 集合
     */
    /**
     * arrayOf 创建数组
     * 创建一个数组传递元素值给它，集合中的元素可以是任意类型
     */
}



package top.lhit.myapplication3.model.lesson

fun main() {
    /**
     * 循环控制语句也是每门语言不可缺少的一部分，
     * 一般就是我们所熟知的for、while、do-while
     * Kotlin循环其实几乎和Java中的一模一样
     */

    //for循环
    var list= listOf<String>("java", "kotlin", "android")
    //for-in
    for (item in list ) println(item)

    list.forEach{println(it)}
    list.forEachIndexed{index,item -> println()}
    /**
     * while循环 当condition为true时执行循环体
     */
//    while (true){
//        println("1111")
//    }
    var index =0
    while (index <list.size){
        println("The$index element is ${list[index++]}")
    }
    /**
     * do while
     * 先做了在看while条件是否为true 为true就再做
     */
    index = 0
    do {
        println("The$index element is ${list[index++]}")
    }while (index<list.size)
    /**
     * 迭代区间和数列
     * 如上所诉，for可以循环遍历任何提供了迭代器的对象。即
     * ：有一个成员函数或者扩展函数iterator(),它的返回类型，
     * 有一个成员函数或者扩展函数next()，并且有一个成员函数
     * 或者扩展函数hasNext() 返回Boolean
     * 如需在数字区间上迭代 ， 请使用区间表达式
     */
    //for in []
    for (i in 1..10){
        //遍历区间，注意Kotlin的区间式包含或者式闭合的
        println("$i ")
    }
    //for in until
    //输出结果： 1 2 3 4 5 6 7 8 9 10
    for (i in 1 until 10){
        println("$i")
    }
    //for  in    downTo    step
    //step 以2 进1
    for (i in 10 downTo  1 step 2){
        println("$i")
    }
    /**
     * 循环中的break 与 continue
     * 在循环中 Kotlin类似Java中break 和continue操作符
     * ·break ：终止直接包围它的循环
     * ·continue：继续下一次包围它的循环
     */
    for (i in 1..100){
        if (i%2 == 0) continue//符合条件 直接进行下一次循环
        for (j in 1..100){
            if (j<50) break//直接停止循环
        }
    }
}
package top.lhit.myapplication3.model.lesson

//Kotlin中的Kotlin扩展函数
fun main() {
    Jump.print("林海")
    /**
     * why？：
     * 1、提供架构的易用性
     * 2、减少代码量，让代码更加整洁、纯粹
     * 3、提高编码的效率，生产力提高
     *
     *在Kotlin中提供了大量的扩展，使我们
     * 的代码更加简洁，开发出来的框架更加易用
     */
    /**
     * 目录：
     * 1、扩展方法
     * 2、扩展方法的使用：
     *  2-1在Kotlin中使用
     *  2-2在Java中使用
     * 3、原理解析：Kotlin扩展函数是怎么实现的
     * 4、泛型扩展方法
     * 5、扩展属性
     * 6、为伴生对象添加扩展
     * 7、Kotlin中常用的扩展
     * 案例：使用Kotlin扩展为控件绑定监听器减少模板代码
     */
    /**
     * Kotlin能够扩展一个类的新功能而无需继承该类
     * 例如： 你可以为一个你不能修改的来自第三方库中
     * 的类编写一个新的函数。这个新增的函数就像
     * 那个原始类本来就有的函数一样，可以用普通的
     * 方法调用。这种机制称为扩展函数。此外，也有扩展属性
     * ，允许你为一个已经存在的类添加新的属性
     */

    /**
     * 1、扩展方法
     * Kotlin的扩展函数可以让你作为一个类成员进行调用的函数。
     *扩展方法的定义，就是在方法的前面加上类前缀
     */


    /**
     * 泛型扩展方法
     */


    val test2 = mutableListOf("Android Q", "Android N", "Android M")
    test2.swap1(0, 1)
    println(test2)
    for (s in test2) {
        println("index:${s}")
    }

    val s = "android"
    val lastChar = s.lastChar
    println(lastChar)

    /**
     * 原理：
     * 1、Kotlin的扩展是怎么实现的？
     *  在java中是使用反射来获取这个扩展函数的 所以必须传一个该类的实例过去
     * 2、Kotlin的扩展会不会有性能问题？
     */
    testLet("2222")
   testLet(null)
    //apply内置扩展函数
    testApply()
}

class Jump {
    fun test() {
        println("jump test")
        //在呗扩展的类中使用
    }

    companion object {}
}

//扩展方法的定义，就是在方法的前面加上类前缀
fun Jump.doubleJump(): String {
    return "doubleJump"
}

//泛型化扩展函数
fun <T> MutableList<T>.swap1(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

/**
 * 2、扩展属性
 * 扩展属性提供了一种方法通过属性语法进行访问的API来扩展。
 * 尽管它们被叫成属性，但是它们不能拥有任何状态，它不能添加额外的
 * 字段到现有的Java对象实例
 */
//为String添加一个lastChat属性，用于获取字符串的最后一个字符
val String.lastChar: Char get() = this.get(length - 1)

/**
 * 3、为伴生对象添加扩展
 *  如果一个类定义了伴生对象，那么我们也可以为伴生对象定义扩展函数与属性
 */
fun Jump.Companion.print(str: String): String {
    println(str)
    return str;
}
/**
 * 4、Kotlin中常用的扩展函数：
 * 4-1：let
 * 4-2：run
 * 4-3：apply
 */
/**
 * 4-1 let扩展
 * let扩展函数实际上是一个作用域函数，当你需要去定义一个变量在一个特定的
 * 作用域范围内，那么let函数是一个不错的选择；
 * let函数可以避免一些判断null的操作
 */
fun testLet(str: String?) {
    //限制str2的作用域
    /**
     *let扩展函数，类后面加上？代表参数可能为空，使用的时候
     * 注意判空
     */
    //错误的let写法
//    str.let {
//        val str2 = "let扩展"
//        println(it + str2)
//    }
    //报错
    //避免为null的操作

    //正确的let函数写法
//    str?.let {
//        val s = "android"
//        println(
//            s + it
//        )
//    }
    //Elvis操作符的写法
    val len = str ?:  "str"
    println(len)
}
/**
 * 4-2run扩展函数
 * run函数只接收一个lambda函数为参数，以闭包形式返回，
 * 返回值为最后一行的值或者指定的return的表达式，在run函数中可以直接访问实例的
 * 公有属性和方法
 */
//run 扩展函数
fun testRun(jump: Jump){
    jump.run {
        doubleJump()
        test()
        "fklasdjfklas"
    }
}
/**
 * 4-3apply扩展函数
 * apply函数的作用是：调用某对象的apply函数，在函数范围内，可以任意
 * 调用该对象的任意方法，并返回该对象。
 * 从结构上来看apply函数和run函数很像，唯一不同点就是它们各自返回的值
 * 不一样，run函数是以闭包形式返回最后一行代码的值，而apply函数的返回的是
 * 传入对象的本身。
 * apply一般用于一个对象实例初始化的时候，需要对实例中的属性进行赋值。或
 * 动态inflate出一个XML的View的时候需要给View绑定数据也会用到，这种情景很常见
 */

fun testApply(){
    ArrayList<String>().apply {
        add("testApply1")
        add("testApply2")
        add("testApply3")
        add("testApply4")
        add("testApply5")
    }.run {
        for (s in this) {
            println("apply:${s}")
        }
    }.let {
        println(it)
    }
}
/**
 * 案例：使用Kotlin扩展为控件绑定监听器减少模板代码
 *
 */








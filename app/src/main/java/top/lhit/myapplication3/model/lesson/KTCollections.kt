package top.lhit.myapplication3.model.lesson

/**
 * kotlin容器
 */
fun main() {
    /**
     * kotlin数组
     * 1、使用arrayOf()创建数组，必须指定数组的元素，可以是任意类型
     */
    val arrayNumber: Array<Int> = arrayOf(1, 2, 3, 4)
    //集合中的元素可以是任意类型
    //Kotlin中的Any 等价于java中的Object 对象的意思
    val array: Array<Any> = arrayOf(1, true, 1, 23)

    /**
     * arrayOfNulls 创建数组
     * 创建一个指定大小的、所有元素都为空的数组，但必须指定集合中的元素的类型
     */
    val arrayOfNulls = arrayOfNulls<String>(5)

    arrayOfNulls[0] = "element1"
    arrayOfNulls[1] = "element2"
    arrayOfNulls[2] = "element3"
    arrayOfNulls[3] = "element4"
    arrayOfNulls[4] = null
    /**
     * 利用array的构造函数，动态创建数组
     * 创建一个 Array<String> 初始化位[""]
     */
    /**
     *数组创建的时候，会循环5次，i就是数组的下标
     * ->右边的表达式的结果，就是数组中当前下标的元素
     */

    val asc = Array(5) { i -> (i * i).toString() }
    /**
     * 字节数组
     */
    val bytes = ByteArray(5)
    /**
     * 使用IntArray创建整型的数组
     * 创建一个长度位5的空的IntArray数组
     */
    val intArray2 = IntArray(5)
    intArray2[0] = 1
    intArray2[1] = 2
    intArray2[2] = 3
    intArray2[3] = 4
    intArray2[4] = 5
    //创建一个长度为5且值都是100的IntArray[100]
    val intArr = IntArray(5){100}
    //注意这里it是它索引的下标值
    val intArr3 = IntArray(5){it * 2 }//it,lambda表达变量 表达下标


    
}
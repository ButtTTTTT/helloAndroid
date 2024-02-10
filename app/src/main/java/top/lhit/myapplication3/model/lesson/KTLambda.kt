package top.lhit.myapplication3.model.lesson

fun main() {

    fun transform(
        array: Array<Int>,
        action: (
            index: Int,
            elemnt: Int
        )
        -> Int
    ) {
        for (index in array.indices) {
            var newValue = action(index, array[index])
            array[index] = newValue
        }
    }

    val numbers = arrayOf(1, 2, 3, 4, 5)
    transform(numbers, action = { index, e ->
        index * e
    })
    for (number in numbers) {
        println("transform:$number")
    }
    /**
     * 如何使用it ： item
     */
    //lambda 隐形参数it
    numbers.forEach { println(it) }
    val list = arrayListOf<Int>(1, 2, 3, 45, 6)
    list.forEachIndexed(action = { index: Int, e: Int ->
        println("forEachIndexed:$index->${e}")
    })
    list.forEachIndexed { index, i -> println("forEachIndexex2:$index->${i}") }

}

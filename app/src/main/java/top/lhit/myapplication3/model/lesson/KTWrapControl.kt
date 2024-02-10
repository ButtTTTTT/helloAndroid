package top.lhit.myapplication3.model.lesson
fun main() {
    /**
     * if 表达式
     * 带返回值if表达式
     * 在Kotlin中，if是一个表达式
     * 所以它会返回一个值，表达式
     * 的值为表达式作用域内最后一行的值。。这一代女和Java不同
     */
    fun maxOf(a:Int,b:Int):Int{
        if (a>b){
            return  a;
        }else{
            return b;
        }
    }
    /**
     *if表达式替代三目运算符
     */
    fun maxOf2(a:Int,b:Int):Int{
        return if (a>b) a else b
    }
    /**
     * 多级条件选择器
     */
    fun eval(number:Number){
        //如果是Int类型
        //is 是判断是否是某一种类型
        if (number is Int){
            println("this is int num")
        }
        //多级if 跟java没区别
    }
    /**
     * when 替代了java中的switch when同样需要返回值的
     * when将它的参数与所有的分支条件顺序比较，知道某个分支满足条件
     */
    fun eval2(number:Any):String=when(number){
        is Int -> "this is Int number "
        is Double ->"this is Double number"
        is Float -> "this is Float number"
        else -> "invalid number"
    }
    eval(1)
    eval2("ahfdskjafds")
    /**
     * when 表达式功能增强
     * 1.3版本后可以给他动态赋值
     */
    fun getValue():Any{
        return "a"
    }
    fun eval3(args:Array<String>){
        when (val value = getValue()) {//when表达式条件直接是一个表达式，并用value保存了返回值, 实际上相当于把外部那一行缩进来写
            is Int -> "This is Int Type, value is $value".apply(::println)
            is String -> "This is String Type, value is $value".apply(::println)
            is Double -> "This is Double Type, value is $value".apply(::println)
            is Float -> "This is Float Type, value is $value".apply(::println)
            else -> "unknown type".apply(::println)
        }
    }

















}
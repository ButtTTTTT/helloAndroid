package top.lhit.myapplication3.model.Bean

class Person{
    //需要先构建出实例，才能访问成员方法
    fun test(){
        println("成员方法")
    }

    /**
     * 当我们想在一个普通类中定义一个静态方法的话
     * 可以定义companion object 内部派生类来实现
     */
    companion object{
        fun test2(){
            println("成员方法2")
        }
    }
}
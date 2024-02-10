package top.lhit.myapplication3.model.lesson

import org.json.JSONObject
import top.lhit.myapplication3.model.Bean.Drink
import top.lhit.myapplication3.model.Bean.User

/**
 * 深入理解Kotlin泛型
 * Kotlin的泛型与Java 一样。
 * 其实就是把类型参数化，它的引入给强类型编程
 * 语言加入了更强的灵活性
 *
 */
fun main() {
    /**
     * ·泛型接口/类(泛型类型)
     * ·泛型字段
     * ·泛型方法
     * ·泛型约束
     * ·泛型中的out与in
     */

    /**
     * 1、泛型接口/类(泛型类型)
     * 定义泛型类型，在类型名之后、主构函数
     * 之前用尖括号括起的大写字母类型参数指定：
     */

    val drinkApple = DrinkApple()
    drinkApple.drink("afd")
    /**
     *  2、泛型类
     */
    var blueColor = BlueColor("blue")
    blueColor.printColor()
    /**
     * 定义泛型类型字段，可以完整地写明类型参数，
     * 如果编译器可以自动推定类型参数，
     * 也可以省略类型参数：
     */

    /**
     * 泛型方法：
     * 类型参数要放在方法名的前面：
     */
    fun <T> fromJson(json: String, tClass: Class<T>): T? {
        val t: T? = tClass.getDeclaredConstructor().newInstance()
        return t
    }
    /**
     * 泛型约束
     * 限定泛型参数的类型
     * 
     * 泛型类型限定 -1
     * 所传递的类型T必须满足是User的子类，或User类
     */
    fun <T : User> fromJson(json: String, tClass: Class<T>): T? {
        val t: T? = tClass.getDeclaredConstructor().newInstance();
        return t
    }
    //3.泛型方法
    fromJson<String>("{}",String::class.java)
    /**
     *4、 泛型约束
     */
    /**
     * 泛型类型限定为-1
     * 所传递的类型T必须满足是User的子类 或者User类
     */
    fun <T:JSONObject> fromJson2(json:String,tClass:Class<T>):T?{
        val instance: T?=tClass.getDeclaredConstructor().newInstance();

        return instance;
    }
    fromJson2("{}",JSONObject::class.java)

    /**
     * 泛型约束2
     * 所传递的类型T必须满足where 子句的所有条件
     * 下面的示例中，类型T必须即实现了User也要实现了
     * Comparable<T>
     */
    fun <T>fromJson3(json:String,tClass:Class<T>):T?
    where T:JSONObject,T:Comparable<T>{
        val newInstance = tClass.getDeclaredConstructor().newInstance()
        return newInstance;
    }
    class User :JSONObject(),Comparable<User>{
        override fun compareTo(other: User): Int {
            return 1;
        }
    }
    /**
     * 泛型中的out于in
     * 在Kotlin中out代表协变，in代表逆变，为了加深理解
     * 我们可以将Kotlin的协变看成Java中的上界通配符，将
     * 逆变看出Java中的下界通配符
     */
    /**
     * out约束泛型参数的类型上限
     * 泛型参数的类型允许传入T,以及T的子类
     */
    /**
     * 在定义泛型中 in约束关键字声明 T的下限
     * 也就是说 T可以是T 以及他的父类
     */
    class InArrayList<in T> {

    }
    /**
     * 在定义出使用out关键字声明，允许传入的泛型参数可以是T以及T的子类
     * 上限为T T的父类无法使用 T的子类可以使用
     */
    class ArrayList<out T>{

    }
    open class Animal
    open class DogAnimal:Animal()
    class CatAnimal:Animal()
    class WhiteDogAnimal: DogAnimal()
    fun animalFuns(){
        val animal: Animal = DogAnimal()
        //下面会报错 Kotlin中不能做集合类型的强转
//        val animalList: ArrayList<Animal> = ArrayList<DogAnimal>()
        //传入的泛型参数可以是Animal及Animal的子类DogAnimal、、、
        //1、在使用处使用out关键字声明--泛型上限
        val animalList: ArrayList<out Animal> = ArrayList<DogAnimal>()
//        val animalList2: ArrayList<Animal> = ArrayList<DogAnimal>()
        val animalList3:InArrayList< DogAnimal> = InArrayList<Animal>()


    }


}

abstract class Color<T>(var t: T/*泛型字段*/) {
    abstract fun printColor()
}

class BlueColor(val color: String) : Color<String>(color) {
    override fun printColor() {
        println("class BlueColor")
    }

}

class Blue {
    val color = "blue"
}

class DrinkApple : Drink<String> {
    override fun drink(t: String) {
        println(t)
    }

}
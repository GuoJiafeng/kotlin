package Kt001_基本要素_函数和变量
/*
 @Author :Create by Guo Jiafeng

 @Date : Created in 15:45 2017/9/16

@Descripon :

 */


//在kotlin中许多变量的声明可以直接省略

val  question = "String类型可以直接省略"

val  anser = 32

//但是依然可以显示声明变量

val  anser1 :Int  = 11


//如果你是用浮点数常量，那么变量就是Double类型
val  gg = 2.3e3


//val 在kt中是不可变引用  使用val声明的变量不能在初始化之后再次赋值  对应的java就是final变量


//var 在kt中是可引用变量  这种变量的值可以被改变 这种声明对应java中普通的变量

//在定义了val变量的代码块执行期间 val变量只能进行一次唯一一次初始化 如果比编译器能确定这个变量能后确保只有唯一一条条件语句会被执
// 行 可以根据条件使用不用的值来初始化他



//尽管val引用自身是不可变的 但是他指向的对象可能是可变的  例如

val luangue  = arrayListOf("Java")

fun main(args : Array<String>){
  luangue.add("Kotlin")



    val  message :String

    if(true){
        message = "Success"
    }else{
        message = "Filed"
    }





    println(message)
}


//即使var关键子允许更改自己的变量 但他的类型确实改变不了的


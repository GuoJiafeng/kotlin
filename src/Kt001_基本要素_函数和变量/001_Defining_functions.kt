package Kt001_基本要素_函数和变量

fun main(args: Array<String>) {
    print(sum01(1, 3))
    printSun(11, 11)
}


//定义方法 计算 a+b的值  返回值为Int
//Function having two Int parameters with Int return type:
fun sum01(a:Int , b :Int) : Int{
    return a+b
}

//Function with an expression body and inferred return type:

fun sum02(a:Int ,b:Int)  = a+b

//Function returning no meaningful value:
//Unit 在java中就是void
fun printSun(a:Int ,b:Int) :Unit{
println("sum of $a and $b is ${a+b}")
}










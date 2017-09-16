package Kt001_基本要素_函数和变量

//max方法名  括号内是形参列表 括号外是返回值  return 后面的语句的意思是java中的三元运算符   （a>b） a else b
fun max1(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//还可以定义更加简单的表达式函数体
fun max5(a: Int, b: Int): Int = if (a > b) a else b

//还可以直接将返回值类型省略掉，但是仅限于表达式函数
fun max3(a: Int, b: Int) = if (a > b) a else b


//主方法
fun main(agrs: Array<String>) {
    println(max5(2, 3))
}
